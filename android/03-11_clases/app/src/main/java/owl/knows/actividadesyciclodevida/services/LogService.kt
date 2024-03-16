package owl.knows.actividadesyciclodevida.services

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.util.Log

class LogService : Service() {
    private var handler: Handler? = null
    private val retardo = 5000L

    private val runnable : Runnable = object : Runnable {
        override fun run() {
            Log.d("BACKGROUND-SERVICE","Servicio background ejecutandose")
            handler?.postDelayed(this, retardo)
        }
    }

    override fun onCreate() {
        super.onCreate()
        handler = Handler()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        this.handler?.postDelayed(this.runnable, retardo)
        return START_STICKY
    }

    override fun onDestroy() {
        handler?.removeCallbacks(runnable)
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}