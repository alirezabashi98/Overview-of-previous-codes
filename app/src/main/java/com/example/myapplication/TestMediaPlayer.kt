package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test_media_player.*

class TestMediaPlayer : AppCompatActivity() {

    lateinit var musice : MediaPlayer
    var is_Play = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_media_player)

        musice = MediaPlayer.create(this,R.raw.musice)

        btn_player.setOnClickListener {

            if (is_Play){

                musice.pause()
                is_Play = false

            }else{

                musice.start()
                is_Play = true

            }

        }

    }
}