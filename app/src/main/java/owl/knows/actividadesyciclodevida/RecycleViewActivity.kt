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


        list = mutableListOf(
            Usuario("Alex",R.drawable.image1,"Llamar"),
            Usuario("Daniela",R.drawable.image2,"Mensaje"),
            Usuario("Melany",R.drawable.image3,"Eliminar"),
            )

        val adapter = AdapterUsuario(list,this)
        this.binding.rvUsuarios.layoutManager=LinearLayoutManager(this)
        this.binding.rvUsuarios.adapter = adapter
    }
}