package com.example.practicauno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.practicauno.databinding.ActivityPreguntaBinding
import com.example.practicauno.databinding.ActivitySaludoBinding

class Saludo : AppCompatActivity() {
    private lateinit var binding: ActivitySaludoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySaludoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegresar.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
        action()
    }
    private fun action(){
        val bundle= intent.extras
        val nombre = bundle?.getString("NOMBRE")
        val mensaje:TextView=findViewById(R.id.tvwSalida)
        mensaje.text="Hola $nombre"
    }
}