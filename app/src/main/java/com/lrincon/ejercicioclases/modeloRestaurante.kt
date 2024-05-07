package com.lrincon.ejercicioclases

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class modeloRestaurante: AppCompatActivity() {

    private val database = FirebaseDatabase.getInstance().reference.child("reserva")
    private lateinit var insertarNombre: EditText
    private lateinit var insertarHora: EditText
    private lateinit var insertarFecha: EditText
    private lateinit var crearReserva: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reservas)
//   val btnAgregarProducto = findViewById<Button>(R.id.btnAgregarProducto)

        insertarNombre = findViewById(R.id.insertarNombre)
        insertarHora = findViewById(R.id.insertarHora)
        insertarFecha = findViewById(R.id.insertarFecha)


        findViewById<Button>(R.id.crearReserva).setOnClickListener {
            val nombre = insertarNombre.text.toString()
            val fecha = insertarHora.text.toString()
            val hora = insertarFecha.text.toString()

            // Crear un nuevo producto en Firebase
            val reservaId = database.push().key
            if (reservaId != null) {
                val reserva = Restaurante(reservaId, nombre, fecha, hora)
                database.child(reservaId).setValue(reserva)
            }

            finish() // Finalizar la actividad después de agregar el producto
        }
    }

}