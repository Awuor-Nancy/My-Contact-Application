package pic_book.com.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class viewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("Name", "")
        var email = extras?.getString("Email","")

        Toast.makeText(this," $name: $email",Toast.LENGTH_SHORT).show()

    }
}