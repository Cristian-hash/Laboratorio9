package com.example.app

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AudioplayService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }


    override fun onStartCommand(intent: Intent,flags:Int,startId:Int):Int{

        return START_STICKY
    }
}