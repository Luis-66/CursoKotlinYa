/* 5 - Estructura condicional if
Cuando hay que tomar una decisión aparecen las estructuras condicionales.
En nuestra vida diaria se nos presentan situaciones donde debemos decidir.
¿Elijo la carrera A o la carrera B?
¿Me pongo este pantalón?
Para ir al trabajo, ¿elijo el camino A o el camino B?
Al cursar una carrera, ¿elijo el turno mañana, tarde o noche?

Estructura condicional simple
Cuando se presenta la elección tenemos la opción de realizar una actividad o
no realizar ninguna

 */

fun main() {
//problema1()
    //problema2()
    //problema3()
    //ejercicio1()
    ejercicio2()
}

private fun problema1() {
    /*
Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje
en pantalla indicando que debe abonar impuestos.
    */
    println("Ingrese su sueldo")
    val sueldo = readln()!!.toDouble()

    if (sueldo > 3000.0) {
        println("Usted gana mas de 3000 tiene que pagar impustos")
    } else {
        println("Usted gana menos de 3000 no debe de pagar impuestos")
    }

}

private fun problema2() {
    /*Realizar un programa que solicite ingresar dos números enteros distintos y
    muestre por pantalla el mayor de ellos (suponemos que el operador del programa
    ingresa valores distintos, no valida nuestro programa dicha situación)
     */
    println("Ingresa el primer número")
    val numero1 = readln()!!.toInt()
    println("Ingresa el segundo número")
    val numero2 = readln()!!.toInt()

    if (numero1 > numero2) {
        println("El numero mayor es $numero1")
    } else {
        println("El numero mayor es $numero2")
    }


}

private fun problema3() {
    /*
Se ingresan por teclado 2 valores enteros. Si el primero es menor al segundo calcular
la suma y la resta, luego mostrarlos, sino calcular el producto y la división.
     */
    println("Ingresa el primer número")
    val numero1 = readln()!!.toInt()
    println("Ingresa el segundo número")
    val numero2 = readln()!!.toInt()

    if (numero1 < numero2) {
        println("$numero1 + $numero2 = ${numero1 + numero2}")
        println("$numero1 - $numero2 = ${numero1 - numero2}")
    } else {
        println("$numero1 * $numero2 = ${numero1 * numero2}")
        println("$numero1 / $numero2 = ${numero1 / numero2}")
    }
}

private fun ejercicio1() {
    /*
Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un
mensaje "Promocionado".
     */
    println("Ingresa tu primer nota")
    val nota1 = readln()!!.toDouble()
    println("Ingresa la segunda nota")
    val nota2 = readln()!!.toDouble()
    println("Ingresa la tercer nota")
    val nota3 = readln()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3

    if (promedio > 7) {
        println("Aprobado con $promedio")
    } else {
        println("Reprobado con $promedio")
    }

}

private fun ejercicio2() {
    /*
Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
     */

    println("Ingrese un número entero")
    val numero = readln().toInt()

    if (numero in 1..9) {
        println("$numero tiene un digito")
    } else if (numero in 10..99) {
        println("$numero tiene dos digitos")

    } else {
        println("Fuera del rango 1 .. 99")
    }
}
