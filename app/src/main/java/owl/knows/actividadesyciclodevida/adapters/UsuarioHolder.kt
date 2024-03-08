package owl.knows.actividadesyciclodevida.adapters

import android.content.ClipData.Item
import android.media.Image
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import owl.knows.actividadesyciclodevida.R
import owl.knows.actividadesyciclodevida.models.Usuario

class UsuarioHolder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
    private val image = ItemView.findViewById<ImageView>(R.id.ivRVFoto)
    private val nombre = ItemView.findViewById<TextView>(R.id.tvRVNombre)
    private val boton = ItemView.findViewById<Button>(R.id.btnRVAccion)

    fun bind(usuario: Usuario) {
        this.nombre.text = usuario.nombre
        this.boton.text =  usuario.accionBoton
        this.image.id = usuario.idImage

        this.boton.setOnClickListener {
            Log.d("RVusuario", "usuario: ${usuario.nombre}")
        }
    }

}