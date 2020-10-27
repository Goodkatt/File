package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.tel.*

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tel)


        var counter = 0
        var i = 0
        val handler = Handler()

        progressBar.isVisible = false
        textView2.isVisible = false

        editTextTextPersonName.addTextChangedListener(object : TextWatcher {
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
            if(counter == 0) {
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
                val timer = object : CountDownTimer(120000, 1000) {
                    override fun onFinish() {
                        return
                    }

                    override fun onTick(millisUntilFinished: Long) {
                        textView2.text = (millisUntilFinished / 1000).toString()

                    }

                }
                timer.start()
                counter++
            }

            else{
                startActivity(Intent(this@ActivityTwo, TelActivity::class.java))
            }
        })
    }
}