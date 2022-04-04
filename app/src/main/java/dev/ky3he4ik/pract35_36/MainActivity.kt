package dev.ky3he4ik.pract35_36

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    class BlueFragment : Fragment(R.layout.fragment_blue)
    class RedFragment : Fragment(R.layout.fragment_red)

    private var flag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replace()
        findViewById<Button>(R.id.caption).setOnClickListener {
            flag = !flag
            replace()
        }
    }

    private fun replace() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment1, if (flag) RedFragment() else BlueFragment())
            replace(R.id.fragment2, if (!flag) RedFragment() else BlueFragment())
            addToBackStack(null)
            commit()
        }
    }
}
