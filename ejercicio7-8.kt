fun main() {
    print("Ingrese una cadena de texto: ")
    val textoUsuario = readLine()
    if (textoUsuario != null) {
        val textoConcatenado = "Hola, " + textoUsuario + "!"
        println("Texto concatenado: $textoConcatenado")
    } else {
        println("No se ingresó un texto válido")
    }
}
