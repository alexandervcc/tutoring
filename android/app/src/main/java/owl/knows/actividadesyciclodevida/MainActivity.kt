package owl.knows.actividadesyciclodevida

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import owl.knows.actividadesyciclodevida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // ViewBinding
    private lateinit var binding:ActivityMainBinding

    // onCreate: metodo de ciclo de vida
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configuras el layout de esta vista
        // metodo por defecto
        // setContentView(R.layout.activity_main)

        // vincular la vista con view-binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.d("CYCLE","creacion")

        // Metodo por defecto para obtener/manipularas las vistas
        // findViewById

        this.binding.btnFormularioActivity.setOnClickListener {
            val intent = Intent(this,FormularioActivity::class.java)
            startActivity(intent)
        }

        this.binding.btnListaSimple.setOnClickListener {
            val intent = Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }


        this.binding.btnWebSearch.setOnClickListener {
            val uri = Uri.parse("https://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        this.binding.btnRecycleView.setOnClickListener {
            val intent = Intent(this, RecycleViewActivity::class.java)
            startActivity(intent)
        }

        this.binding.btnServicio.setOnClickListener {
            val intent = Intent(this,ServicioActivity::class.java)
            startActivity(intent)
        }

        this.binding.btnEnviarEmail.setOnClickListener {
            val intentEmail = Intent(Intent.ACTION_SEND)
            intentEmail.type = "message/rfc822"

            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("alex.charco@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"Probar intent explicito email")
            intent.putExtra(Intent.EXTRA_TEXT,"Body del correo")

            startActivity(intentEmail)

        }
    }



    override fun onStart() {
        super.onStart()
        Log.d("CYCLE","start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CYCLE","resume")
        // finish()
    }

    override fun onPause() {
        super.onPause()
        Log.d("CYCLE","pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CYCLE","stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CYCLE","destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CYCLE","restart")
    }
}