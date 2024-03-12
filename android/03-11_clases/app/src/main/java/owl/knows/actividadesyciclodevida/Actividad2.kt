package owl.knows.actividadesyciclodevida

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Actividad2 : AppCompatActivity() {
    lateinit var btnFinalizar:Button
    lateinit var btnCancelar:Button
    lateinit var textoPrincipal:TextView
    lateinit var tvNombre:TextView
    lateinit var tvEmail:TextView
    lateinit var tvPassword:TextView
    lateinit var tvGenero:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        this.btnFinalizar = findViewById(R.id.btnFinalizar)
        this.btnCancelar = findViewById(R.id.btnCancelar)
        this.textoPrincipal = findViewById(R.id.tv_ac2_textPrincipal)
        this.tvNombre= findViewById(R.id.tv_ac2_nombre)
        this.tvEmail = findViewById(R.id.tv_ac2_email)
        this.tvPassword = findViewById(R.id.tv_ac2_contrasena)
        this.tvGenero = findViewById(R.id.tv_ac2_genero)

        this.btnFinalizar.setOnClickListener {
            val intentResult = Intent()
            intentResult.putExtra("resultado","Registro Exitoso")
            setResult(Activity.RESULT_OK,intentResult)
            finish()
        }

        this.btnCancelar.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }

        // Obtener los parametros recibidos (extras)
        val mensaje = intent.getStringExtra("mensaje")
        val nombre = intent.getStringExtra("nombre")
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")
        val genero = intent.getBooleanExtra("genero",false)

        if(mensaje!=null){
            this.textoPrincipal.text = mensaje
        }else{
            this.textoPrincipal.text = "Mensaje por defecto"
        }

        if(nombre!=null){
            this.tvNombre.text = nombre
        }
        if(email!=null){
            this.tvEmail.text = email
        }
        if(password!=null){
            this.tvPassword.text = password
        }
        if(genero){
            this.tvGenero.text = "M"
        }else{
            this.tvGenero.text = "F"
        }
    }
}