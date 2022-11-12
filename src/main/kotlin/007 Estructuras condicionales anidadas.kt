/* 7 - Estructuras condicionales anidadas

Decimos que una estructura condicional es anidada cuando por
la rama del verdadero o el falso de una estructura condicional
hay otra estructura condicional.


 */

fun main() {
    //problema1()
    //problema1_2()
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    ejercicio4()
}

private fun problema1() {
    /*
    Confeccionar un programa que pida por teclado tres notas de un alumno,
    calcule el promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado".
    Si el promedio es >=4 y <7 mostrar "Regular".
    Si el promedio es <4 mostrar "Reprobado".
    */
    println("ingrese la primer calificación ")
    val nota1 = readln()!!.toInt()
    println("ingrese la segunda calificación ")
    val nota2 = readln()!!.toInt()
    println("ingrese la tercera calificación ")
    val nota3 = readln()!!.toInt()

    val promedio = (nota1 + nota2 + nota3) / 3

    if (promedio >= 7) {
        println("Promedio: $promedio \nPromocionado")
    } else if (promedio in 4..6) {
        println("Promedio: $promedio\nRegular")
    } else if (promedio in 0..3) {
        println("Promedio: $promedio\nReprobado")
    }

}

private fun problema1_2() {
    /*
    Si utilizamos if como expresiones podemos codificar el mismo programa en forma más
    concisa con el siguiente código:
     */
    println("ingrese la primer calificación ")
    val nota1 = readln()!!.toInt()
    println("ingrese la segunda calificación ")
    val nota2 = readln()!!.toInt()
    println("ingrese la tercera calificación ")
    val nota3 = readln()!!.toInt()

    val promedio = (nota1 + nota2 + nota3) / 3

    val result = if (promedio >= 7) {
        "Promedio: $promedio \nPromocionado"
    } else if (promedio in 4..6) {
        "Promedio: $promedio\nRegular"
    } else {
        "Promedio: $promedio\nReprobado"
    }
    println(result)
}

private fun ejercicio1() {
    /*
    Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
     */

    println("Ingrese el primer numero")
    val num1 = readln()!!.toInt()
    println("Ingrese el segundo numero")
    val num2 = readln()!!.toInt()
    println("Ingrese el tercer numero")
    val num3 = readln()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("El numero mayor es: $num1")
    } else if (num2 > num1 && num2 > num3) {
        println("El numero mayor es: $num2")
    } else {
        println("El numero mayor es: $num3")
    }

}

private fun ejercicio2() {
    /*
    Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número
    es positivo, nulo o negativo
     */
    println("Ingrese el número")
    val num1: Int? = readln()!!.toInt()

    if (num1 == null) {
        println("nulo")
    } else if (num1 == 0) {
        println("Valor cero")
    } else if (num1 > 0) {
        println("Positivo")
    } else {
        println("Negativo")
    }

}

private fun ejercicio3() {
    /*
    Confeccionar un programa que permita cargar un número entero positivo de hasta
    tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
    Mostrar un mensaje de error si el número de cifras es mayor.
     */
    println("Ingrese el número")
    val num1: Int? = readln()!!.toInt()


    if (num1 in 0..9) {
        println("Un digito\n$num1")
    } else if (num1 in 10..99) {
        println("Dos digitos\n$num1")
    } else if (num1 in 100..999) {
        println("Tres digitos\n$num1")
    } else if (num1 in 1000..9999) {
        println("Cuatro digitos\n$num1")
    } else {
        println("Error")
    }


}

private fun ejercicio4() {
    /*
    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
    siguiente información: cantidad total de preguntas que se le realizaron y la
    cantidad de preguntas que contestó correctamente. Se pide confeccionar un
    programa que ingrese los dos datos por teclado e informe el nivel del mismo
    según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:


    Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
     */
    println("Ingrese el total de preguntas")
    val totalPreguntas = readln()!!.toInt()
    println("Ingrese el total de preguntas correctas")
    val totalCorrectas = readln()!!.toInt()

    val porcentaje = (totalCorrectas * 100) / totalPreguntas

    if (porcentaje >= 90) {
        println("Nivel máximo")
    } else if (porcentaje >= 75 && porcentaje <= 90) {
        println("Nivel medio")
    }else if (porcentaje >= 50 && porcentaje <=75){
        println("Nivel regular")
    }else{
        println("Fuera de nivel")
    }


}
