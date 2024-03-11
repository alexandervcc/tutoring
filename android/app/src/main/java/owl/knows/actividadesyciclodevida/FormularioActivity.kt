package owl.knows.actividadesyciclodevida

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import owl.knows.actividadesyciclodevida.databinding.ActivityFormularioBinding

class FormularioActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFormularioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(this.binding.root)


        // conexion desde el boton hacia la funcion
        this.binding.btnRegistrar.setOnClickListener {
            handleRegistrarButton()
        }
    }

    private fun handleRegistrarButton(){
        val nombre = this.binding.etNombre.text.toString()
        val email = this.binding.etEmail.text.toString()
        val password = this.binding.etPassword.text.toString()
        val genero = if( this.binding.swGenero.isActivated) "M" else "F"

        // validacion
        if(nombre.length< 3 ){
            Toast.makeText(this, "Nombre incompleto", Toast.LENGTH_SHORT).show()
            return
        }

        if(email.length< 10 ){
            Toast.makeText(this, "Email incompleto", Toast.LENGTH_SHORT).show()
            return
        }

        if(password.length<=8){
            Toast.makeText(this, "Password incompleto", Toast.LENGTH_SHORT).show()
            return
        }

        val usuario = User(nombre, email, password, genero)

        // Conexion a la red ...

        // Navegacion
        val intent = Intent(this, Actividad2::class.java)
        //parametros
        // extra: parametros -> primitivas (Parseable)
        intent.putExtra("mensaje","Hola, como estas")
        intent.putExtra("nombre",nombre)
        intent.putExtra("email",email)
        intent.putExtra("password",password)
        intent.putExtra("genero",this.binding.swGenero.isActivated)

        // navegacion
        //startActivity(intent)

        //navegacion con resultado
        this.navegacionActividad2.launch(intent)

        Toast.makeText(this,"Usuario creado", Toast.LENGTH_SHORT).show()
    }


    private val navegacionActividad2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode== Activity.RESULT_CANCELED){
            // this.binding.etNombre.text = "Error"
        }
        if(it.resultCode == Activity.RESULT_OK){
            val dataIntent = it.data
            val texto = dataIntent?.getStringExtra("resultado")
            if(texto!=null){
                // this.binding.etNombre.text = texto
            }
        }
    }
}