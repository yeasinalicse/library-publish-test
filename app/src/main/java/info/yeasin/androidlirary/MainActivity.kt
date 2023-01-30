package info.yeasin.androidlirary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.yeasin.mylibrary.Sydney

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sydney.suburbs[0]
    }
}