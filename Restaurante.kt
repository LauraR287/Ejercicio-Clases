package com.lrincon.apptrendlink

CONTROLADOR
class Restaurante(nombre: String, ubicacion: String, horario: String) {
    var nombre: String = nombre
    var ubicacion: String = ubicacion
    var horario: String = horario
    var reservas: MutableList<Map<String, Any>> = mutableListOf()
}

MODELO
fun reserva(mesa: Int, nombreCliente: String, fecha: String, hora: String) {
    val reserva = mapOf(
        "cliente" to nombreCliente,
        "mesa" to mesa,
        "fecha" to fecha,
        "hora" to hora
    )
    reservas.add(reserva)
    println("Reserva realizada por $nombreCliente para la mesa $mesa el $fecha a las $hora.")
}

*/
fun main(){
    var restaurante = Restaurante("Kivala restaurante", "Calle 12c #25-67", "12:00pm - 11:00pm")
    restaurante.reserva(12, "Laura Rincón", "27 de Julio 2024", "7:00pm")
}
/*