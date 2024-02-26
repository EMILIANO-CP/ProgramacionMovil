package com.example.practicauno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.practicauno.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {
    private lateinit var binding:ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        binding.PerBoton.setOnClickListener{
            salto()
        }
    }
    private fun salto(){
        var persona: Persona = Persona()
        persona.nombre =binding.PerNombre.text.toString()
        persona.apellido =binding.PerApellido.text.toString()
        persona.correo =binding.PerCorreo.text.toString()
        if(persona.nombre.isNotEmpty() && persona.apellido.isNotBlank() && persona.correo != ""){
            val intent= Intent(this, Repuesta_Registro_Per::class.java)
            intent.putExtra("DATOS",persona)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Necesito algun dato", Toast.LENGTH_SHORT).show()
        }
    }
}