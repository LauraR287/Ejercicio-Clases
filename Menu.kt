package com.lrincon.apptrendlink


class Menu(categoria: String, plato: String, descripcion: String, precio: Double) {
    var categoria: String = categoria
    var plato: String = plato
    var descripcion: String = descripcion
    var precio: Double = precio
    var listaPlatos: MutableList<Map<String, Any>> = mutableListOf()
}


MODELO

fun agregarPlato(categoria: String, plato: String, descripcion: String, precio: Double) {
    val nuevoPlato = mapOf(
        "categoria" to categoria,
        "plato" to plato,
        "descripcion" to descripcion,
        "precio" to precio
    )
    listaPlatos.add(nuevoPlato)
    println("Se agregó el plato: $plato, con la descripción $descripcion, y a un precio de $$precio")
}




*/

fun main(){
    var menu = Menu("postre", "Arroz con leche", "Postre dulce a base de arroz y leche", 9000.0);
    menu.agregarPlato("bebida", "Coca-cola", "Bebida de postobon", 4000.0)
}

/*