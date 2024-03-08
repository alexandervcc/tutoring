package owl.knows.actividadesyciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.recyclerview.widget.ListAdapter
import owl.knows.actividadesyciclodevida.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding
    private val items = mutableListOf<String>("opcion 1","opcion 2","opcion 3")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items )

        this.binding.listViewSimple.adapter = adaptador

        this.binding.btnActualizarLista.setOnClickListener {
            this.items.add("opcion ${items.size+1}")
            this.binding.listViewSimple.adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items )
        }
    }


}