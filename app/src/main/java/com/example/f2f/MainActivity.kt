
//we can communicate between 2 fragments using shared viewmodels
//we can also do that by using callbaks in interface but that may throw some exceptions

//FrameLayout is designed to block out an area on the screen to display a single item.
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.f2f.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            add(R.id.fragment_1_holder, Fragment1())
            add(R.id.fragment_2_holder, Fragment2())
            commit()
        }
    }
}
