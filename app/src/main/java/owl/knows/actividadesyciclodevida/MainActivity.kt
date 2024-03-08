package owl.knows.actividadesyciclodevida

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import owl.knows.actividadesyciclodevida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // ViewBinding
    private lateinit var binding:ActivityMainBinding

    // onCreate: metodo de ciclo de vida
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configuras el layout de esta vista
        // metodo por defecto
        // setContentView(R.layout.activity_main)

        // vincular la vista con view-binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.d("CYCLE","creacion")

        // Metodo por defecto para obtener/manipularas las vistas
        // findViewById

        // conexion desde el boton hacia la funcion
        this.binding.btnRegistrar.setOnClickListener {
            handleRegistrarButton()
        }

        this.binding.btnListaSimple.setOnClickListener {
            val intent = Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }


        this.binding.btnWebSearch.setOnClickListener {
            val uri = Uri.parse("https://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        this.binding.btnEnviarEmail.setOnClickListener {
            val intentEmail = Intent(Intent.ACTION_SEND)
            intentEmail.type = "message/rfc822"

            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("alex.charco@gmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT,"Probar intent explicito email")
            intent.putExtra(Intent.EXTRA_TEXT,"Body del correo")

            startActivity(intentEmail)

        }
    }

    private fun handleRegistrarButton(){
        val nombre = this.binding.etNombre.text.toString()
        val email = this.binding.etEmail.text.toString()
        val password = this.binding.etPassword.text.toString()
        val genero = if( this.binding.swGenero.isActivated) "M" else "F"

        // validacion
        if(nombre.length< 3 ){
            Toast.makeText(this, "Nombre incompleto",Toast.LENGTH_SHORT).show()
            return
        }

        if(email.length< 10 ){
            Toast.makeText(this, "Email incompleto",Toast.LENGTH_SHORT).show()
            return
        }

        if(password.length<=8){
            Toast.makeText(this, "Password incompleto",Toast.LENGTH_SHORT).show()
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

        Toast.makeText(this,"Usuario creado",Toast.LENGTH_SHORT).show()
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

    override fun onStart() {
        super.onStart()
        Log.d("CYCLE","start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CYCLE","resume")
        // finish()
    }

    override fun onPause() {
        super.onPause()
        Log.d("CYCLE","pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CYCLE","stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CYCLE","destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CYCLE","restart")
    }
}