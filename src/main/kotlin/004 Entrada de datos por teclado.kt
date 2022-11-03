/*4 - Entrada de datos por teclado en la Consola

Cuando utilizamos la Consola para mostrar información por pantalla
utilizamos las funciones print y println. Si necesitamos entrar datos
por teclado podemos utilizar la función readln.
 */

fun main(){
    //problema1()
    //problema2()
     //problema3()
    //ejercicio1()
    ejercicio2  ()

}
private fun problema1(){
/*
Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
*/
    println("Ingrese el primer numero")
    val numero1 = readln().toInt()
    println("Ingrese el segundo numero")
    val numero2 = readln().toInt()
    println("La Suma de los numeros es ${numero1 + numero2}")


}
private fun problema2(){
/*
Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
(El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
 */
    println("Ingrese el lado de un cuadrado: ")
    val lado = readLine()!!.toInt()

    println("El perimetro del cuadrado es ${lado * 4}")
}
private fun problema3(){
/*
Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la
cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
 */
    println("Ingrese el precio del articulo")
    val precioArt = readln()!!.toInt()
    println("Ingrese la cantidad de  articulos")
    val cantidadArt = Integer.valueOf(readlnOrNull())

    println("Total: $ ${cantidadArt * precioArt}")

}
private fun ejercicio1(){
/*
Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar
la suma de los dos primeros y el producto del tercero y el cuarto.
 */
    println("Ingrese el primer numero: ")
    val numero1 = readln()!!.toInt()
    println("Ingrese el segundo numero: ")
    val numero2 = readln()!!.toInt()
    println("Ingrese el tercero numero: ")
    val numero3 = readln()!!.toInt()
    println("Ingrese el cuarto numero: ")
    val numero4 = readln()!!.toInt()

    println("Suma: $numero1 + $numero2 = ${numero1 + numero2}")
    println("Multiplicacion: $numero3 * $numero4 = ${numero3 * numero4}")

}
private fun ejercicio2(){
/*
Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar su
suma y promedio.
 */
    println("Ingrese el primer numero: ")
    val numero1 = readln()!!.toInt()
    println("Ingrese el segundo numero: ")
    val numero2 = readln()!!.toInt()
    println("Ingrese el tercero numero: ")
    val numero3 = readln()!!.toInt()
    println("Ingrese el cuarto numero: ")
    val numero4 = readln()!!.toInt()

    println("Suma: $numero1 + $numero2  + $numero3 + $numero4 = " +
            "${numero1 + numero2 + numero3 + numero4}")
   println("El promedio es  ${ (numero1 + numero2 + numero3 + numero4)/(4)}")

}

