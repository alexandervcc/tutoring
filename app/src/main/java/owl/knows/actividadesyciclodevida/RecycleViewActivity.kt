package owl.knows.actividadesyciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import owl.knows.actividadesyciclodevida.adapters.AdapterUsuario
import owl.knows.actividadesyciclodevida.databinding.ActivityRecycleViewBinding
import owl.knows.actividadesyciclodevida.models.Usuario

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecycleViewBinding
    private var list = mutableListOf<Usuario>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // anadir datos
        this.list.add( Usuario("Alex",R.drawable.image1,"Llamar")        )
        this.list.add( Usuario("Jeniffer",R.drawable.image2,"Mensaje")        )
        this.list.add( Usuario("Diana",R.drawable.image3,"Email")        )

        // crear un adaptador
        val adapter = AdapterUsuario(this.list, this)

        this.binding.rvUsuarios.adapter = adapter
        this.binding.rvUsuarios.layoutManager = LinearLayoutManager(this)


        this.binding.btnRVAnadirPersona.setOnClickListener {
            this.list.add(Usuario("Persona ${list.size}", R.drawable.image1,"Accion"))
            this.binding.rvUsuarios.adapter?.notifyDataSetChanged()
        }

        this.binding.btnRVRemoverPersona.setOnClickListener {
            this.list.removeAt(0)
            this.binding.rvUsuarios.adapter?.notifyDataSetChanged()
        }
    }
}