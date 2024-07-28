import java.io.File

fun main() {
    val archivo = File("miArchivo.txt")
    archivo.writeText("Hola Mundo\n")
}

