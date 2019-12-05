package com.henry.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.henry.msgshareapp.R
import com.henry.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg= bundle.getString("user_message")

            showToast(msg)
            txvUserMessage.text = msg

        }

    }
}