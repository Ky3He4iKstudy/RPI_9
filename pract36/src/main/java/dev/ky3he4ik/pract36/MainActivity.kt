package dev.ky3he4ik.pract36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment1, ColorListFragment())
            replace(R.id.fragment2, ColoredFragment())
            addToBackStack(null)
            commit()
        }
    }
}
