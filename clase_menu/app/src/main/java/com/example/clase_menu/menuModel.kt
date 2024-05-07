package com.example.clase_menu

import android.os.Bundle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class menuModel {
    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference.child("menu")

    fun obtenerListaPlatos(): List<Plato> {
        return listOf(
            Plato("1", "Plato fuerte", "Ajiaco", "Sopa típica de pollo, papa, mazorca, yuca y guascas. Es un plato muy popular y delicioso.", 24.000),
            Plato("2", "Plato fuerte", "Bandeja Paisa", "Incluye arroz, frijoles, carne molida, chicharrón, huevo frito, aguacate, plátano maduro y arepa. Es una comida deliciosa y abundante.", 28.000),
            Plato("3", "Bebida", "Limonada", "", 7.000),
            Plato("4", "Postre", "Merengon", " Merengue, frutas frescas y crema de leche.", 13.000)
        )
    }

    fun agregarPlato(nombre: String, categoria: String, descripcion: String, precio: Double) {
        val platoId = database.push().key
        if (platoId != null) {
            val plato = Plato(platoId, categoria, nombre, descripcion, precio)
            database.child(platoId).setValue(plato)
        }
    }
}
