package jp.techachademy.hiroshi.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.text = "タップしてください"

        button1.setOnClickListener({ view: View? ->
            this.showTimePickerDialog()
        })
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                    Log.d("test","${hourOfDay}")
                    if (hourOfDay >= 2 && hourOfDay < 10) {
                        textView.text = "おはよう"
                    } else if (hourOfDay >= 10 && hourOfDay < 18) {
                        textView.text = "こんにちは"
                    } else {
                        textView.text = "こんばんわ"
                    }

                },
                13, 0, true)

        timePickerDialog.show()
    }
}