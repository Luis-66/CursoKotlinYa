/* 8 - Condiciones compuestas con operadores lógicos

Hasta ahora hemos visto los operadores:

relacionales (>, <, >=, <= , ==, !=)
matemáticos (+, -, *, /, %)
pero nos están faltando otros operadores imprescindibles:

lógicos (&&, ||)
Estos dos operadores se emplean fundamentalmente en las estructuras condicionales
para agrupar varias condiciones simples.
 */

fun main() {
//problema1()
    //problema2()
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    //ejercicio4()
    //ejercicio5()
    ejercicio6()
}

private fun problema1() {
    /*
    Confeccionar un programa que lea por teclado tres números y nos muestre el mayor.
    */
    println("Ingrese el primer número")
    val num1 = readln()!!.toInt()
    println("Ingrese el segundo número")
    val num2 = readln()!!.toInt()
    println("Ingrese el tercer número")
    val num3 = readln()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("El número mayor es $num1")
    } else if (num2 > num3) {
        println("El número mayor es $num2")
    } else {
        println("El número mayor es $num3")
    }

}

private fun problema2() {
    /*
Se carga una fecha (día, mes y año) por teclado.
Mostrar un mensaje si corresponde al primer trimestre del año (enero, febrero o marzo)
Cargar por teclado el valor numérico del día, mes y año. Ejemplo: dia:10 mes:2 año:2017.
     */
    print("Ingrese el dia: ")
    val dia = readln()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readln()!!.toInt()
    print("Ingrese el año: ")
    val anno = readln()!!.toInt()

    if (mes == 1 || mes == 2 || mes == 3) {
        println("La fecha corresponde al primer trimestre")
        println("dia:$dia mes:$mes año:$anno")

    } else {
        println("La fecha no corresponde al primer trimestre")
        println("dia:$dia mes:$mes año:$anno")
    }
}

private fun ejercicio1() {
    /*
    Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
    dicha fecha corresponde a Navidad.
     */
    print("Ingrese el dia: ")
    val dia = readln()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readln()!!.toInt()
    print("Ingrese el año: ")
    val anno = readln()!!.toInt()

    if (mes == 12 && dia == 25) {
        println("La fecha corresponde a Navidad")
        println("dia:$dia mes:$mes año:$anno")

    } else {
        println("La fecha no corresponde a  Navidad")
        println("dia:$dia mes:$mes año:$anno")
    }

}

private fun ejercicio2() {
    /*
Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del
número y mostrarlo.
     */
    println("Ingrese el primer valor: ")
    val valor1 = readln()!!.toInt()
    println("Ingrese el segundo valor: ")
    val valor2 = readln()!!.toInt()
    println("Ingrese el tercer valor: ")
    val valor3 = readln()!!.toInt()

    if (valor1 == valor2 && valor2 == valor3) {
        println("Los tres valores son iguales")
        println("Cubo de $valor1: ${valor1 * valor1 * valor1}")
    } else {
        println("No todos los valores son iguales")
    }
}

private fun ejercicio3() {
    /*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
 imprimir en pantalla la leyenda "Todos los números son menores a diez".
     */
    println("Ingrese el primer valor: ")
    val valor1 = readln()!!.toInt()
    println("Ingrese el segundo valor: ")
    val valor2 = readln()!!.toInt()
    println("Ingrese el tercer valor: ")
    val valor3 = readln()!!.toInt()

    if (valor1 < 10 && valor2 < 10 && valor3 < 10) {
        println("Todos los números son menores a diez")
    } else {
        println("No todos los valores son menores a diez")
    }


}

private fun ejercicio4() {
    /*
Se ingresan por teclado tres números, si al menos uno de los valores ingresados
es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez"
     */
    println("Ingrese el primer valor: ")
    val valor1 = readln()!!.toInt()
    println("Ingrese el segundo valor: ")
    val valor2 = readln()!!.toInt()
    println("Ingrese el tercer valor: ")
    val valor3 = readln()!!.toInt()

    if (valor1 < 10 || valor2 < 10 || valor3 < 10) {
        println("Alguno de los números son menores a diez")
    } else {
        println("Alguno de los números no es menor a diez")
    }


}

private fun ejercicio5() {
    /*
Escribir un programa que pida ingresar la coordenada de un punto en el plano,
es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
     */
    println("Ingrese el valor de X: ")
    val valorX = readln()!!.toInt()
    println("Ingrese el valor de Y: ")
    val valorY = readln()!!.toInt()

    if (valorX > 0 && valorY > 0) {
        println("Cuadrante 1")
    } else if (valorX < 0 && valorY > 0) {
        println("Cuadrante 2")
    } else if (valorX < 0 && valorY < 0) {
        println("Cuadrante 3")
    } else if (valorX > 0 && valorY < 0) {
        println("Cuadrante 4")
    }else{
        println("Valor de X:$valorX  Valor de Y:$valorY")
    }

}

private fun ejercicio6() {
    /*
Escribir un programa en el cual: dada una lista de tres valores enteros
ingresados por teclado se guarde en otras dos variables el menor y el mayor de esa lista.
Utilizar el if como expresión para obtener el mayor y el menor.
Imprimir luego las dos variables.
     */
    println("Ingrese el primer valor: ")
    val valor1 = readln()!!.toInt()
    println("Ingrese el segundo valor: ")
    val valor2 = readln()!!.toInt()
    println("Ingrese el tercer valor: ")
    val valor3 = readln()!!.toInt()

    val menor = if (valor1 < valor2 && valor1 < valor3) valor1 else if (valor2 < valor3) valor2 else valor3
    val mayor = if (valor1 > valor2 && valor1 > valor3) valor1 else if (valor2 > valor3) valor2 else valor3

    println("El valor mayor es: $mayor\nEl valor menor es: $menor")
}
