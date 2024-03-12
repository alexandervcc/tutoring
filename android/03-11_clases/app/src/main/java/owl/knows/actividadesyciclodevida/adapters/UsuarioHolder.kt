package owl.knows.actividadesyciclodevida.adapters

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import owl.knows.actividadesyciclodevida.R
import owl.knows.actividadesyciclodevida.models.Usuario

class UsuarioHolder(private val view: View,
                    private val context: Context
):RecyclerView.ViewHolder(view) {
    private val image = view.findViewById<ImageView>(R.id.ivRVFoto)
    private val nombre = view.findViewById<TextView>(R.id.tvRVNombre)
    private val boton = view.findViewById<Button>(R.id.btnRVAccion)

    fun bind(usuario: Usuario) {
        this.nombre.text = usuario.nombre
        this.boton.text =  usuario.accionBoton
        this.image.setImageResource(usuario.idImage)

        this.boton.setOnClickListener {
            Toast.makeText(context,"$usuario",Toast.LENGTH_SHORT).show()
        }
    }

}