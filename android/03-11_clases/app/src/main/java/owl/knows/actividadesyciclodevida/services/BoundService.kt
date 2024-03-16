package owl.knows.actividadesyciclodevida.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder
import android.provider.Settings
import android.util.Log

class BoundService : Service() {
    private val binder: BinderBoundMusicService by lazy {
        BinderBoundMusicService()
    }

    private var reproductor :MediaPlayer? = null


    override fun onBind(intent: Intent): IBinder {
        return this.binder
    }

    fun reproducir(){
        this.reproductor = MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)
        this.reproductor?.setLooping(true)
        this.reproductor?.start()
    }

    fun detener(){
        this.reproductor?.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BOUND-SERVICE","Servicio destruido")
        this.detener()
        this.reproductor = null
    }


    inner class BinderBoundMusicService : Binder(){
        fun getService():BoundService = this@BoundService
    }

}