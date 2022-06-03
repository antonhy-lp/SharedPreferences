package mx.edu.tecmm.moviles.practica6

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgregarP : AppCompatActivity()  {

    lateinit var nombre: EditText
    lateinit var carrera: EditText
    lateinit var telefono: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        nombre = findViewById(R.id.txtNom)
        carrera = findViewById(R.id.txtCar)
        telefono = findViewById(R.id.txtCel)


    }
    fun abreParaModificar(v: View){
        Log.e("text", "xd")
        val misPreferencias = getSharedPreferences("Mis datos", Context.MODE_PRIVATE)

        with(misPreferencias.edit()){
            putString("nombre", nombre.text.toString())
            putString("tel", telefono.text.toString())
            putString("Car", carrera.text.toString())
            commit()
        }

        Toast.makeText(this,"Se grabo", Toast.LENGTH_SHORT).show()
        finish()
    }

}