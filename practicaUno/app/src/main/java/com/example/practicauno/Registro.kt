package com.example.practicauno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.practicauno.databinding.ActivityPreguntaBinding

class Registro : AppCompatActivity() {
    private lateinit var binding:ActivityPreguntaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPreguntaBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_registro)
        binding.btnBoton.setOnClickListener{
            salto()
        }
    }
    private fun salto(){
        var persona: Persona = Persona()
        persona.nombre=binding.etNombre.text.toString()
        var texto: EditText =findViewById(R.id.etNombre)
        if(persona.nombre.isNotEmpty() && persona.apellido.isNotBlank() && persona.correo != ""){
            val intent= Intent(this, Saludo::class.java)
            intent.putExtra("NOMBRE",texto.text.toString())
            startActivity(intent)
        }else{
            Toast.makeText(this,"Necesito un nombre", Toast.LENGTH_SHORT).show()
        }
    }
}