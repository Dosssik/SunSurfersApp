package ru.sunsurfers.sunapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.content_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        button_sign_in.setOnClickListener {
            startActivity(Intent(applicationContext, UserActivity::class.java))
            finish()
        }

        warning_icon.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Внимание, сансерфер")
                    .setMessage("Перед тобой прототип приложения, тут все ненастоящее! :) \n\n" +
                            "Прототипчик этот написан, что бы можно было потыкать на кнопочки, " +
                            "и посмотреть, как все будет работать в будущем. \n\nEnjoy!")
                    .setPositiveButton("Все понятно!", { dialog, _ -> dialog.dismiss() })
                    .create().show()
        }
    }

}
