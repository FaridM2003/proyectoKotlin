fun main() {
    val numero1 = 10
    val numero2 = 5
    
    // Operadores de comparación
    println("numero1 = $numero1, numero2 = $numero2")
    println("numero1 == numero2: ${numero1 == numero2}") // false
    println("numero1 != numero2: ${numero1 != numero2}") // true
    println("numero1 < numero2: ${numero1 < numero2}") // false
    println("numero1 > numero2: ${numero1 > numero2}") // true
    println("numero1 <= numero2: ${numero1 <= numero2}") // false
    println("numero1 >= numero2: ${numero1 >= numero2}") // true
    
    // Operadores lógicos
    val condicion1 = numero1 > numero2
    val condicion2 = numero1 < 15
    
    println("condicion1 = $condicion1, condicion2 = $condicion2")
    println("condicion1 && condicion2: ${condicion1 && condicion2}") // true
    println("condicion1 || condicion2: ${condicion1 || condicion2}") // true
    println("!condicion1: ${!condicion1}") // false
}
