package com.example.practicauno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practicauno.databinding.ActivityRepuestaRegistroPerBinding

class Repuesta_Registro_Per : AppCompatActivity() {
    private  lateinit var binding: ActivityRepuestaRegistroPerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRepuestaRegistroPerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.respRegBtnRegresar.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
        action()
    }
    private fun action(){
        val bundle= intent.extras
        val datos_persona = bundle?.getSerializable("DATOS") as Persona
        val msj_nombre:TextView=findViewById(R.id.resp_reg_nombre)
        msj_nombre.text="NOMBRE: " + datos_persona.nombre
        val msj_apellido:TextView=findViewById(R.id.resp_reg_apellido)
        msj_apellido.text="APELLIDOS: " + datos_persona.apellido
        val msj_correo:TextView=findViewById(R.id.resp_reg_correo)
        msj_correo.text="E-MAIL: " + datos_persona.correo
    }
}