package owl.knows.actividadesyciclodevida.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import owl.knows.actividadesyciclodevida.R
import owl.knows.actividadesyciclodevida.models.Usuario

class AdapterUsuario(private val lista:List<Usuario>):RecyclerView.Adapter<UsuarioHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv,parent,false)
        return UsuarioHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: UsuarioHolder, position: Int) {
        val usuario = lista.get(position)
        // configuracion vista + holder
        holder.bind(usuario)
    }

}