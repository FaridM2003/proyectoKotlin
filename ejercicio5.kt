fun main() {
    print("Ingrese un número entero: ")
    val numero = readLine()?.toInt()
    if (numero != null) {
        println("El número ingresado es: $numero")
    } else {
        println("No se ingresó un número válido")
    }
}
