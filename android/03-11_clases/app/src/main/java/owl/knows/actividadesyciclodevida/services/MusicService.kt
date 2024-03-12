package owl.knows.actividadesyciclodevida.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log

// Tipos de servicios
// Foreground: notables por el usuario
// Background: operacion no notable por el usuario
// Bound: enlace con los componente (Actividad). Corre siempre y cuando haya un componente vinculado

// Ciclo de vida: metodos sobrecargables
// invoca el servicio
class MusicService : Service() {
    private lateinit var reproductor:MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        Log.d("SERVICE","MusicService onStartCommand")

        this.reproductor = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)

        this.reproductor.setLooping(true)

        this.reproductor.start()

        return START_STICKY

        // CODIGOS DE REINICIO
        // int a devolver es un codigo que indica como ejecutar el servicio en caso de destruccion
        // si llega a morir, reiniciara el servicio y llamara la metodo onStartCommand
        // no tenemos acceso al ultimo intent
        // return START_STICKY

        // no se recrea por defecto, a menos que haya intents pendientes de entrega
        // return START_NOT_STICKY

        // servicio que reinicia con el ultimo intent que fuere recibido
        // return START_REDELIVER_INTENT
    }

    // cuando un componente quiere hacer la vinculacion al servicio
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    // crear el servicio, configuracion de ella. Este metodo se ejecuta si el servicio aun no existe
    // Se ejecuta entes de onStartCommand
    override fun onCreate() {
        super.onCreate()
        Log.d("SERVICE","MusicService creado")
    }

    // el servicio ya no es necesario y sera destruido. Limpieza de recursos
    override fun onDestroy() {
        super.onDestroy()
        Log.d("SERVICE","MusicService Destruido")
    }
}