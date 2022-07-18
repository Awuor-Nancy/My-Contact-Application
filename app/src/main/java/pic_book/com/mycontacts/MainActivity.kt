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

        var contact1 = Contact("John Doe","0765463272","JohnDoe@gmail.com","Karen","https://unsplash.com/photos/fUFOerH8hhQ")
        var contact2 = Contact("Lencier Kipsy","0742 507 533","lancier@gmail.com","Hurlingam","https://media.istockphoto.com/photos/excited-woman-wearing-rainbow-cardigan-picture-id1327495437?b=1&k=20&m=1327495437&s=170667a&w=0&h=Vbl-XLyAnBoTkyGXXi-X1CFzuSHlNcn-dqB-sCosxFo=")
        var contact3 = Contact("Vincent Izzy","0765 789 092","Izzyvin@gmail.com","Kahawa","https://media.istockphoto.com/photos/excited-woman-wearing-rainbow-cardigan-picture-id1327495437?b=1&k=20&m=1327495437&s=170667a&w=0&h=Vbl-XLyAnBoTkyGXXi-X1CFzuSHlNcn-dqB-sCosxFo=")
        var contact4 = Contact("Garry Lamez","0712 324 765","lamezgarry@gmail.com","Kcity","https://media.istockphoto.com/photos/shot-of-a-young-doctor-using-a-digital-tablet-in-a-modern-hospital-picture-id1366374033?b=1&k=20&m=1366374033&s=170667a&w=0&h=WAS8kD-qE-DkPmk-RV4nbQfw7ii03w1owc47j0FpLYU=")
        var contact5 = Contact("Edrian Ozzi","0709 321 780","Ozziedi@gmail.com","Buruburu","https://media.istockphoto.com/photos/cheerful-fashionable-adult-man-in-city-setting-picture-id1310533180?b=1&k=20&m=1310533180&s=170667a&w=0&h=EdRuvIkrMifhyZJkHXf5Pk68ri44_g7OFnU8lIdbc-c=")
        var contact6 = Contact("Damian Liam","0100 986 421","Liamdamian@gmail.com","Westlands","https://media.istockphoto.com/photos/elopement-wedding-picture-id1334542509?b=1&k=20&m=1334542509&s=170667a&w=0&h=MXlV6R3q3J5sGagIV4Iobn_S60HOCOzJPWahxPbZinI=")
        var contact7 = Contact("Lizy Mitchelle","0798 075 321","MishyLiz@gmail.com","Upperhill","https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8aHVtYW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")


        var contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}