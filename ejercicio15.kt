fun main() {
    print("dia de la semana en numero:")
    var dia = readLine()?.toInt()
    if (dia!=null){
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            3 -> println("Miércoles")
            4 -> println("Jueves")
            5 -> println("Viernes")
            6 -> println("Sábado")
            7 -> println("Domingo")
        else -> println("No es un día válido")
    }
}
}

