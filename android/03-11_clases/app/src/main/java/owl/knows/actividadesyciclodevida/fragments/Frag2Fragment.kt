package owl.knows.actividadesyciclodevida.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import owl.knows.actividadesyciclodevida.R
import owl.knows.actividadesyciclodevida.databinding.FragmentFrag1Binding
import owl.knows.actividadesyciclodevida.databinding.FragmentFrag2Binding


class Frag2Fragment : Fragment() {
    private var binding:FragmentFrag2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.binding = FragmentFrag2Binding.inflate(layoutInflater)
        return this.binding?.root
    }

    fun recibirMensaje(mensaje:String){
        this.binding?.tvMensajeDesdeFragmento1?.text=mensaje
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}