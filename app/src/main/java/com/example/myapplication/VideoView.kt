package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout.make
import android.widget.MediaController
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.SnackbarContentLayout
import kotlinx.android.synthetic.main.activity_video_view.*

class VideoView : AppCompatActivity() {

    lateinit var mediaController: MediaController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)

//        set video offline
        videoView.setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.video}"))

//        when the video was ready
        videoView.setOnPreparedListener {


//            add Media Controller
            mediaController = MediaController(this)
            videoView.setMediaController(mediaController)
//            start video view
            videoView.start()
//            video mediaController until the film finish
            mediaController.show(videoView.duration)

        }

//        when the video ended
        videoView.setOnCompletionListener {

//            start video view
            videoView.start()
//            video mediaController until the film finish
            mediaController.show(videoView.duration)

        }

    }
}