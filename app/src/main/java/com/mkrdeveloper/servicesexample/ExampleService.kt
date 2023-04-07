package com.mkrdeveloper.servicesexample

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class ExampleService : Service() {
private lateinit var mPlayer : MediaPlayer
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mPlayer = MediaPlayer.create(this, R.raw.song1)
        mPlayer.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        mPlayer.stop()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}