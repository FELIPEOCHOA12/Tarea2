package Carro

abstract class Vehiculo {
    abstract val modelo: String
    abstract val marca: String
    abstract var velocidad: Int

    // Método abstracto
    abstract fun acelerar()

    // Método concreto
    fun frenar() {
        velocidad = 0
        println("$modelo ha sido detenido.")
    }
}

// Interfaz OperacionesVehiculo
interface OperacionesVehiculo {
    fun encender()
    fun apagar()
}

// Subclase CarroDeportivo que hereda de Vehiculo e implementa OperacionesVehiculo
class CarroDeportivo(override val modelo: String, override val marca: String) : Vehiculo(), OperacionesVehiculo {
    override var velocidad: Int = 0

    override fun acelerar() {
        velocidad += 20
        println("$modelo acelerando a $velocidad km/h")
    }

    override fun encender() {
        println("$modelo está encendido.")
    }

    override fun apagar() {
        println("$modelo está apagado.")
    }
}

// Subclase CarroSUV que hereda de Vehiculo e implementa OperacionesVehiculo
class CarroSUV(override val modelo: String, override val marca: String) : Vehiculo(), OperacionesVehiculo {
    override var velocidad: Int = 0

    override fun acelerar() {
        velocidad += 15
        println("$modelo acelerando a $velocidad km/h")
    }

    override fun encender() {
        println("$modelo está encendido.")
    }

    override fun apagar() {
        println("$modelo está apagado.")
    }
}