package owl.knows.actividadesyciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import owl.knows.actividadesyciclodevida.databinding.ActivityFragmentsBinding
import owl.knows.actividadesyciclodevida.fragments.Frag1Fragment
import owl.knows.actividadesyciclodevida.fragments.Frag2Fragment
import owl.knows.actividadesyciclodevida.fragments.IComunicacion

class FragmentsActivity : AppCompatActivity(), IComunicacion {
    private lateinit var binding:ActivityFragmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnFragm1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, Frag1Fragment())
                commit()
            }
        }

        binding.btnFragm2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, Frag2Fragment())
                commit()
            }
        }
    }


    override fun enviarMensaje(mensage:String){
        // obtener referencia al fragmento
        val fragm2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as Frag2Fragment
        if(fragm2==null){
            Toast.makeText(this,"Fragmento no encontrado",Toast.LENGTH_SHORT).show()
            return
        }
        //pasar el mensaje
         fragm2.recibirMensaje(mensage)
        // Toast.makeText(this,"Mensjae enviado al fragmento",Toast.LENGTH_SHORT).show()
    }
}