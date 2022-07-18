package pic_book.com.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import pic_book.com.mycontacts.databinding.ContactListItemBinding

class ContactAdapter(var contactList: List<Contact>):
RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        //displays the list of items

        var binding =ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder = ContactsViewHolder(binding)
        return  contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {  //holds lists of names and binds the data to the view
      var currentContact = contactList.get(position)  //obtain views  by position using index
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhone.text=currentContact.phoneNumber
        holder.binding.tvAddress.text=currentContact.address
        holder.binding.tvEmail.text=currentContact.email
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_account_circle_24)
            .error(R.drawable.ic_baseline_nearby_error_24)
            .resize(300,400)
            .centerCrop()
            .into(holder.binding.ivUser)

        val context = holder.itemView.context
        holder.binding.ivUser.setOnClickListener{
            Toast.makeText(context,"you have clicked on ${currentContact.name } the image", Toast.LENGTH_SHORT).show()
        }
         holder.binding.cvContact.setOnClickListener {
             val intent = Intent(context,ContactsViewHolder::class.java)
             intent.putExtra("Name", currentContact.name)
            intent.putExtra("Email", currentContact.email)
            intent.putExtra("Phone",currentContact.phoneNumber)
            intent.putExtra("Image",currentContact.image)
            intent.putExtra("Address",currentContact.address)
            context.startActivity(intent)
         }
    }

    override fun getItemCount(): Int {
        return  contactList.size
    }
}

class ContactsViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root) {

}
