fun main(){
    println("Introduce variable entero: ")
    val variable = readLine()?.toInt()
    if (variable!=null){
        if (variable%2 == 0){
            println("par")
    }else println("impar")
}
}