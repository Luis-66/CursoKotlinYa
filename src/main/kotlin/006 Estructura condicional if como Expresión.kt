/*
6 - Estructura condicional if como expresión
En Kotlin existe la posibilidad de que la estructura condicional if retorne un valor,
característica no común a otros lenguajes de programación.

Veremos con una serie de ejemplos la sintaxis para utilizar el if como expresión.

 */

fun main(){
    //problema1()
    //problema2()
    ejercicio1()
}
private fun problema1(){
    /*
    Cargar dos valores enteros, almacenar el mayor de los mismos en otra
    variable y mostrarlo.
    */
    println("Ingrese el primer valor")
    val valor1 = readln()!!.toInt()
    println("Ingrese el segundo valor")
    val valor2 = readln()!!.toInt()

    val valorMayor = if (valor1 > valor2) valor1 else valor2
    println("El numero mayor es $valorMayor")

}
private fun problema2(){
    /*
    Ingresar por teclado un valor entero. Almacenar en otra variable el cuadrado de
    dicho número si el valor ingresado es par, en caso que sea impar guardar el cubo.
    Mostrar además un mensaje que indique si se calcula el cuadrado o el cubo.
     */
    println("Ingrese un valor entero")
    val valor1 = readln()!!.toInt()

    val result = if (valor1 % 2 == 0){
        println("Cuadrado")
        valor1 * valor1
    }else{

        println("Cubo")
        valor1 * valor1 * valor1
    }
    println("El resultado es: $result")

}
private fun ejercicio1(){
    /*
    Cargar un valor entero por teclado comprendido entre 1 y 99.
    Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado
    por teclado.
    Mostrar la cantidad de dígitos del número ingresado por teclado.
     */
    println("Ingrese un digito entre 1 y 99")
    val numero = readln()!!.toInt()

    val digitos = if (numero in 1..9) 1 else 2

    println("Tiene $digitos")

}

