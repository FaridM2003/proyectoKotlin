fun main() {
    // Declarar un arreglo de enteros
    val numeros = intArrayOf(10, 20, 30, 40, 50)
    
    // Elemento a buscar
    val elementoABuscar = 10
    
    // Buscar el elemento en el arreglo
    val posicion = numeros.indexOf(elementoABuscar)
    
    // Mostrar la posición del elemento si se encuentra, o un mensaje si no se encuentra
    if (posicion != -1) {
        println("El elemento $elementoABuscar se encuentra en la posición $posicion")
    } else {
        println("El elemento $elementoABuscar no se encuentra en el arreglo")
    }

    println("Longitud del ARRAY: "+numeros.count())
}

