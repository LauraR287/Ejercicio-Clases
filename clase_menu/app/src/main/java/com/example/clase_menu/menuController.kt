package com.example.clase_menu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class menuController(private val context: Context) {

    fun iniciarMenuActivity() {
        val intent = Intent(context, Menu::class.java)
        context.startActivity(intent)
    }
    fun agregarPlato(nombre: String, categoria: String, descripcion: String, precio: Double) {
        val menuModel = menuModel()
        menuModel.agregarPlato(nombre, categoria, descripcion, precio)
    }
}
