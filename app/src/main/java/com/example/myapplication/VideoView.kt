package com.example.myapplication

import android.annotation.SuppressLint
import android.app.AlertDialog
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
    var time_videoView = 0

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)
        val alertdialog = AlertDialog.Builder(this)
            .setView(R.layout.sim_alert_dialog_loading)
            .create()
        alertdialog.show()

//        set video offline
//        videoView.setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.video}"))

//        set video online
        videoView.setVideoURI(Uri.parse("https://aspb13.cdn.asset.aparat.com/aparat-video/a6767f1b61244ae08e454566909d710916452951-240p.mp4"))

//        when the video was ready
        videoView.setOnPreparedListener {

            alertdialog.cancel()
//            add Media Controller
            mediaController = MediaController(this)
            videoView.setMediaController(mediaController)
//            start video view
            videoView.seekTo(time_videoView)
            if (time_videoView == 0)
                videoView.start()
            else
                videoView.pause()
//            video mediaController until the film finish
            mediaController.show(videoView.duration)

        }

//        when the video ended
        videoView.setOnCompletionListener {

//            start video view
            if (time_videoView == 0)
                videoView.start()
            else {
                time_videoView = 0
                videoView.seekTo(time_videoView)
                videoView.start()
            }
//            video mediaController until the film finish
            mediaController.show(videoView.duration)

        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("time",videoView.currentPosition)
        videoView.pause()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        time_videoView = savedInstanceState.getInt("time")
        videoView.seekTo(time_videoView)
    }
}