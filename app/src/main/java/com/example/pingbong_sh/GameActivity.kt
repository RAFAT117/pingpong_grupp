package com.example.pingbong_sh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun Play(view: View?){
        val intent= Intent(this,InGameActivity::class.java)
        startActivity(intent)

    }
}