package owl.knows.actividadesyciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import owl.knows.actividadesyciclodevida.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecycleViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}