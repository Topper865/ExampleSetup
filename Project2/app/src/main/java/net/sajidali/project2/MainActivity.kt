package net.sajidali.project2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.sajidali.sharedlib2.Test2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test2().hello2()
    }
}
