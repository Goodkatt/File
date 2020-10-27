package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.telephony.PhoneNumberFormattingTextWatcher
import android.telephony.PhoneNumberUtils
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tel.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 0
        val handler = Handler()
        //progressBar.isVisible = false
        //textView2.isVisible = false

        button4.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this@MainActivity, ActivityTwo::class.java))
        })


 /*       editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {
                val text = editTextTextPersonName.text.toString()
                val textLength = editTextTextPersonName.text.length
                if (text.endsWith("-") || text.endsWith(" ")) {
                    return
                }
                if (textLength == 1) {
                    if (!text.contains("(")) {
                        editTextTextPersonName.setText(StringBuilder(text).insert(text.length - 1, "(").toString())
                        editTextTextPersonName.setSelection(editTextTextPersonName.text.length)
                    }
                } else if (textLength == 5) {
                    if (!text.contains(")")) {
                        editTextTextPersonName.setText(StringBuilder(text).insert(text.length - 1, ")").toString())
                        editTextTextPersonName.setSelection(editTextTextPersonName.text.length)
                    }
                } else if (textLength == 6) {
                    editTextTextPersonName.setText(StringBuilder(text).insert(text.length - 1, " ").toString())
                    editTextTextPersonName.setSelection(editTextTextPersonName.text.length)
                } else if (textLength == 10) {
                    if (!text.contains("-")) {
                        editTextTextPersonName.setText(StringBuilder(text).insert(text.length - 1, "-").toString())
                        editTextTextPersonName.setSelection(editTextTextPersonName.text.length)
                    }
                } else if (textLength == 15) {
                    if (text.contains("-")) {
                        editTextTextPersonName.setText(StringBuilder(text).insert(text.length - 1, " ext").toString())
                        editTextTextPersonName.setSelection(editTextTextPersonName.text.length)
                    }
                }
            }
        })

        button5.setOnClickListener(View.OnClickListener {
            progressBar.isVisible = true
            textView2.isVisible = true


            i = progressBar!!.progress
            Thread(Runnable {
                while (i < 100) {
                    i += 5
                    // Update the progress bar and display the current value
                    handler.post(Runnable {
                        progressBar!!.progress = i

                    })
                    try {
                        Thread.sleep(1000)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }).start()
            val timer = object: CountDownTimer(120000, 1000){
                override fun onFinish() {
                    return
                }

                override fun onTick(millisUntilFinished: Long) {
                    textView2.text = (millisUntilFinished / 1000).toString()

                }

            }
            timer.start()
        })
*/
    }
}

//TO DO Progress bar smooth olacak, milisaniye dakika conversion yapılacak, count down saniye değil dakika olarak gösterilecek.