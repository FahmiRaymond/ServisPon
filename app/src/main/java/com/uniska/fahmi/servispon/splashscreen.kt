package com.uniska.fahmi.servispon

import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class splashscreen : AppCompatActivity() {

    private val waktu_loading = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            val home = Intent(this@splashscreen, login::class.java)
            startActivity(home)
            finish()
        }, waktu_loading.toLong())
    }
}