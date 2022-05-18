package com.example.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.app.Notification.EXTRA_NOTIFICATION_ID
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag : String = "apple juice"
        var price: Int = 0
        var x:Int = 0
        var result: Int =0
        var total:String = ""
        val number: EditText = findViewById(R.id.editTextNumber)
        val iTEMS: Spinner = findViewById(R.id.spinner)
        val btnSend:Button= findViewById(R.id.sendbtn)
        var options = arrayOf("apple juice","hashbrowns","banana","kiwi")
        iTEMS.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        iTEMS.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        if (flag == "apple juice")
            price = 99
        else if (flag == "hashbrowns")
            price = 12
        else if (flag == "banana")
            price = 3
        else
            price = 5
        x = number.text.toString().toInt()
        result = x * price
        total = " total is: " + result.toString() + "JD"

        btnSend.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", total)
            startActivity(intent)

        }
    }
}

