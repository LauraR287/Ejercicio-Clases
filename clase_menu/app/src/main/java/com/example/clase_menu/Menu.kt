package com.example.clase_menu

class Plato(
    val id: String,
    val categoria: String,
    val nombre: String,
    val descripcion: String,
    val precio: Double
)

class Menu(
    val listaPlatos: List<Plato>
)
