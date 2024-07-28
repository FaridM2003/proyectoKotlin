import java.io.File

fun main() {
    val archivo = File("miArchivo.txt")
    archivo.appendText("Adiós Mundo\n")
    println("Texto agregado con exito")
}

