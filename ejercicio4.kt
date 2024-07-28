fun main() {
    // Números enteros
    val entero: Int = 10
    println("Entero: $entero")
    println("Suma: ${entero + 5}")
    println("Resta: ${entero - 3}")
    println("Multiplicación: ${entero * 2}")
    println("División: ${entero / 2}")

    // Números decimales
    val decimal: Double = 3.14
    println("Decimal: $decimal")
    println("Suma: ${decimal + 2.5}")
    println("Resta: ${decimal - 1.2}")
    println("Multiplicación: ${decimal * 2.5}")
    println("División: ${decimal / 2.5}")

    // Caracteres
    val caracter: Char = 'a'
    println("Caracter: $caracter")
    println("Código ASCII: ${caracter.toInt()}")

    // Booleanos
    val verdadero: Boolean = true
    val falso: Boolean = false
    println("AND: ${verdadero && falso}")
    println("OR: ${verdadero || falso}")
    println("NOT: ${!verdadero}")

    // Cadenas de texto
    val texto: String = "Hola"
    println("Texto: $texto")
    println("Concatenación: ${texto + " mundo"}")
    println("Longitud: ${texto.length}")
}
