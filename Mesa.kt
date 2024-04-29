package com.lrincon.apptrendlink

CONTROLADOR
class Mesa(numero: Int, material: String, forma: String) {
    var numero: Int = numero
    var material: String = material
    var forma: String = forma
}

MODELO
fun mostrarMaterial() {
    println("Material de la mesa: $material")
}

fun mostrarNumero() {
    println("El número de la mesa: $numero")
}

fun mostrarForma() {
    println("Forma de la mesa: $forma")
}



*/
fun main(){
    val mesa1 = Mesa(1, "madera", "redonda");
    mesa1.mostrarMaterial()
    mesa1.mostrarNumero()
    mesa1.mostrarForma()
}
/*