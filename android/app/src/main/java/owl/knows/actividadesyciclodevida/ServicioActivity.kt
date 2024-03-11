package owl.knows.actividadesyciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import owl.knows.actividadesyciclodevida.databinding.ActivityServicioBinding
import owl.knows.actividadesyciclodevida.services.MusicService

class ServicioActivity : AppCompatActivity() {
    private lateinit var binding:ActivityServicioBinding
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

    }
}