package Carro

fun main() {
    // Crear instancias de CarroDeportivo y CarroSUV
    val miCarroDeportivo = CarroDeportivo(modelo = "Ferrari 488", marca = "Ferrari")
    val miCarroSUV = CarroSUV(modelo = "Toyota Highlander", marca = "Toyota")

    // Encender y acelerar los carros
    miCarroDeportivo.encender()
    miCarroDeportivo.acelerar()

    miCarroSUV.encender()
    miCarroSUV.acelerar()

    // Frenar los carros
    miCarroDeportivo.frenar()
    miCarroSUV.frenar()

    // Apagar los carros
    miCarroDeportivo.apagar()
    miCarroSUV.apagar()
}