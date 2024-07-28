import java.io.File

fun main() {
    val archivo = File("miArchivo.txt")
    println(archivo.readText())
}
