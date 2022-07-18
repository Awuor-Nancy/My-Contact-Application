package pic_book.com.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pic_book.com.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){

        var contact1 = Contact("Edrian","074207533","awuornancy@gmail.com","Mombasa","https://images.unsplash.com/photo-1563995103864-d87d3c1fdd39?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60","+254 742 507 533","")
        var contact2 = Contact("Flavia","0742678021","flavia@gmail.com","Diani","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60","+254 730 654 121","")
        var contact3 = Contact("Vincent","0708973674","vincent@gmail.com","Nairobi","https://images.unsplash.com/photo-1531384441138-2736e62e0919?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60","+231 745 678 098","")
        var contact4 = Contact("Damian","0732748998","damian@gmail.com","Germany","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60","+233 765 437 862","")
        var contact5 = Contact("Derick","0712094766","derick@gmail.com","Milimani","https://media.istockphoto.com/photos/excited-woman-wearing-rainbow-cardigan-picture-id1327495437?b=1&k=20&m=1327495437&s=170667a&w=0&h=Vbl-XLyAnBoTkyGXXi-X1CFzuSHlNcn-dqB-sCosxFo=","+ 256 786 093 541","")
        var contact6 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ","+121 3456 7968","")
        var contact7 = Contact("Meshack","0798410912","meshack@gmail.com","Hurlingam","https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F236x%2Fc5%2Fe2%2F71%2Fc5e271ec487200264fff8207aad737e4--the-maldives-writing-inspiration.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fcolelarry%2Fphotographs-of-people%2F&tbnid=52sJr1jN2UJuSM&vet=12ahUKEwi0vfua7_z4AhVP3hoKHX3pBjsQMygvegUIARC8Ag..i&docid=WrLeq90KuW7hfM&w=236&h=354&q=people%20pictures&ved=2ahUKEwi0vfua7_z4AhVP3hoKHX3pBjsQMygvegUIARC8Ag","+212 123 678 900","")

        var contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}