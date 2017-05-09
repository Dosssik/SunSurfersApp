package ru.sunsurfers.sunapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_people.*

class PeopleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val bar = supportActionBar

        bar!!.setDisplayHomeAsUpEnabled(true)
        bar.setDisplayShowHomeEnabled(true)
        people_recycler.layoutManager = LinearLayoutManager(this)
        people_recycler.adapter = PeopleAdapter(generateMockPeople())

        findViewById(R.id.click).setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Короче!")
                    .setMessage("Тут будет поиск. Думаю можно будет искать по имени," +
                            " по хэштегам каким нить, по статусу 'впишу/ищу вписку', " +
                            "по увлечениям аля 'йога, кормление уток, восхваление всевышнего и тд'")
                    .setPositiveButton("Ну да, наверное круто будет...", { dialog, _ -> dialog.dismiss() })
                    .create().show()
        }
    }

    private fun generateMockPeople(): List<SunsurferVM> {
        return (1..35)
                .map { SunsurferVM() }

    }
}
