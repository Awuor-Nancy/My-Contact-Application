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

        var contact1 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact2 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact3 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact4 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact5 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact6 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact7 = Contact("Lencier","0765463272","lancier@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")


        var contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}