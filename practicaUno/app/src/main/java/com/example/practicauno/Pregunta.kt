package com.example.practicauno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practicauno.databinding.ActivityPreguntaBinding
import com.example.practicauno.Persona

class Pregunta : AppCompatActivity() {
    private lateinit var binding:ActivityPreguntaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPreguntaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        binding.btnBoton.setOnClickListener{
            salto()
        }
    }
    private fun salto(){
        var texto:EditText=findViewById(R.id.etNombre)
        if(texto.text.isNotEmpty()){
            val intent= Intent(this, Saludo::class.java)
            intent.putExtra("NOMBRE",texto.text.toString())
            startActivity(intent)
        }else{
            Toast.makeText(this,"Necesito un nombre", Toast.LENGTH_SHORT).show()
        }
    }
}