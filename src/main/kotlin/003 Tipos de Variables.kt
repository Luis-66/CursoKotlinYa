//`003 Tipos de Variables`
/*
* Una variable es un depósito donde hay un valor. Consta de un nombre y
* pertenece a un tipo.
* En el lenguaje Kotlin si necesitamos almacenar un valor numérico entero
* podemos definir una variable de tipo:
* Byte
  Short
  Int
  Long
  *
* */
fun main() {

    //problema1()

    //ejercicio1()
    ejercicio2()
}

fun problema1() {
    /*
    Crear un programa que defina dos variables inmutables de tipo Int.
    Luego definir una tercer variable mutable que almacene la suma de las dos
    primeras variables y las muestre. Seguidamente almacenar en la variable el
    producto de las dos primeras variables y mostrar el resultado.
     */

    val variable1 = 100
    val variable2 = 5

    var variable3 = variable1 + variable2
    println("La suma de las dos variables es: $variable3")

    variable3 = variable1 * variable2
    println("La multiplicación de las dos variables es: $variable3")


}

fun ejercicio1() {
    /*
    Definir una variable inmutable con el valor 50 que representa el lado de un cuadrado,
    en otras dos variables inmutables almacenar la superficie y el perímetro del cuadrado.
    Mostrar la superficie y el perímetro por la Consola.
     */
    val lado1 = 50
    val perimetro = lado1 * 4
    val superficie = lado1 * lado1
    println("La superficie del cuadrado es: $superficie")
    println("El perimetro del cuadrado es: $perimetro")





}
fun ejercicio2() {
    /*
    Definir tres variables inmutables y cargar por asignación los pesos de tres personas
    con valores Float. Calcular el promedio de pesos de las personas y mostrarlo.
     */

    val peso1 = 55.0
    val peso2: Float = 70.5f
    val peso3: Float = 66.5f
    val promedio = (peso1 + peso2 + peso3) / 3
    println("El promedio de los tres pesos es: $promedio")


}
