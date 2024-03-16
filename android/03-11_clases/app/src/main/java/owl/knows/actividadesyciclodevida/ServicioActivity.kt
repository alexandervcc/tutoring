package owl.knows.actividadesyciclodevida

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import owl.knows.actividadesyciclodevida.databinding.ActivityServicioBinding
import owl.knows.actividadesyciclodevida.services.BoundService
import owl.knows.actividadesyciclodevida.services.LogService
import owl.knows.actividadesyciclodevida.services.MusicService

class ServicioActivity : AppCompatActivity() {
    private lateinit var binding:ActivityServicioBinding
    // servicio bound
    private var boundService:BoundService? = null



    private val boundConexion by lazy {
        object : ServiceConnection{
            override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                if(service!=null){
                    val binder:BoundService.BinderBoundMusicService = service as BoundService.BinderBoundMusicService
                    boundService = binder.getService()
                }
            }

            override fun onServiceDisconnected(name: ComponentName?) {
                boundService?.detener()
                boundService = null
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityServicioBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        this.binding.btnReproducir.setOnClickListener {
            val intent = Intent(this,MusicService::class.java)
            startService(intent)
        }

        this.binding.btnDetener.setOnClickListener {
            val intent = Intent(this,MusicService::class.java)
            this.stopService(intent)
        }

        this.binding.btnBackStart.setOnClickListener {
            startService(Intent(this,LogService::class.java))
        }

        this.binding.btnBackStop.setOnClickListener {
            stopService(Intent(this,LogService::class.java))
        }

        this.binding.btnBoundStart.setOnClickListener {
            boundService?.reproducir()
        }

        this.binding.btnBoundStop.setOnClickListener {
            boundService?.detener()
        }

        vincularServicioBound()
    }

    private  fun vincularServicioBound(){
        bindService(
            Intent(this,BoundService::class.java),
            boundConexion,
            BIND_AUTO_CREATE
        )
    }

    private fun desvincularServicioBound(){
        unbindService(boundConexion)
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("BOUND-SERVICE","Actividad destruida")
        desvincularServicioBound()
    }
}