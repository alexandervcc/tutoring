package owl.knows.actividadesyciclodevida.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import owl.knows.actividadesyciclodevida.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Frag1Fragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var objectoIComunicacion: IComunicacion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.objectoIComunicacion = activity as IComunicacion
        if(this.objectoIComunicacion == null){
            //Toast.makeText(activity,"Actividad no encontrada desde Fragmento 1",Toast.LENGTH_SHORT).show()
            Log.d("FRAGMENTS","Actividad no encontrada desde Fragmento 1")
            return
        }
        Log.d("FRAGMENTS","Actividad: ${activity?.componentName}")

        view.findViewById<Button>(R.id.btnEnviarMensajeFragmento2).setOnClickListener {
            this.objectoIComunicacion.enviarMensaje("Hola desde el fragmento 1")
        }
    }
}