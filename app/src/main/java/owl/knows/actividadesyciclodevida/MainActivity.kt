package owl.knows.actividadesyciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Vistas
    lateinit var btnRegistro:Button
    lateinit var etNombre:TextView
    lateinit var etEmail:TextView
    lateinit var etPassword:TextView
    lateinit var swGenero:Switch

    // onCreate: metodo de ciclo de vida
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configuras el layout de esta vista
        setContentView(R.layout.activity_main)

        Log.d("CYCLE","creacion")

        // findViewById
        btnRegistro = findViewById(R.id.btnRegistrar)
        etNombre = findViewById(R.id.etNombre)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        swGenero = findViewById(R.id.swGenero)

        // conexion desde el boton hacia la funcion
        btnRegistro.setOnClickListener {
            handleRegistrarButton()
        }
    }

    private fun handleRegistrarButton(){
        val nombre = etNombre.text.toString()
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()
        val genero = if( swGenero.isActivated) "M" else "F"

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

        Toast.makeText(this,"Usuario creado",Toast.LENGTH_SHORT).show()
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