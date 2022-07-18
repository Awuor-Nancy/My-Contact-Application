package pic_book.com.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import com.squareup.picasso.PicassoProvider
import pic_book.com.mycontacts.databinding.ActivityViewContactBinding

class viewContactActivity : AppCompatActivity() {
    lateinit var binding : ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("Name", "")
        var email = extras?.getString("Email","")
        var contact = extras?.getString("Phone","")
        binding.tvContact.text = contact
        binding.tvShow.text = name

       val image= extras?.getString("Image","")
        Picasso.get()
            .load(image)
            .placeholder(R.drawable.ic_baseline_account_circle_24)
            .error(R.drawable.ic_baseline_nearby_error_24)
            .resize(350 ,350)
            .centerCrop()
            .into(binding.ivShow)



        Toast.makeText(this," $name: $email",Toast.LENGTH_SHORT).show()

    }
}