package com.example.ejercicio_n1

fun main() {
    println("Mi Nombre es : Marcelo Alejandro Valenzuela Maraboli")

    var x1 = 10
    var x2 = 20
    var x3 = 30

    println("Las Suma de x1=10,x2=20 y x3=30 es "+" "+(x1+x2+x3))

    var Chains : String = "Ark Reigne"
    var Chart  : Char = 'A'

    println("La cantidad de caracteres de la variable Chains es : "+ Chains.length)
    println("La cantidad de caracteres de la variable Chart  es : "+ Chart.toString().length)

    var Pi : Float
    Pi = 3.141592653589793F
    println("El valor de PI es : "+ Pi)

    println("El Valor Máximo del tipo Byte  es : "+ Byte.MAX_VALUE)
    println("El Valor Máximo del tipo Short es : "+ Short.MAX_VALUE)

    println("El Valor Mínimo del tipo Int  es  :"+ Int.MIN_VALUE)
    println("El Valor Minimo del tipo Long es  :"+ Long.MIN_VALUE)

    var xBoolean : Boolean = true
    println("El Valor la Variable xBoolean es  :"+ xBoolean)
    xBoolean = false
    println("El Nuevo Valor la Variable xBoolean es  :"+ xBoolean)
    println(" ")
    val Cadena1 = "Esta es la Cadena 1"
    val Cadena2 = "Y esta es la Cadena 2"

    imprimeParametros(Cadena1,Cadena2)
    var valorNeto : Int = 2735462
    val tasaIva : Int = 19
    calculaIva(valorNeto,tasaIva)

}

fun imprimeParametros(Cadena1:String,Cadena2:String){
    println(Cadena1)
    println(Cadena2)
    println(" ")
    println("La suma de el largo de ambos parámetos es : "+(Cadena1.length+Cadena2.length))
    println(" ")

}

fun calculaIva(valorNeto:Int,tasaIva:Int){
    var xTotal : Int
    var xIva : Double

    xIva = (valorNeto*tasaIva/100).toDouble()
    xTotal= valorNeto+xIva.toInt()

    println("Total Neto   $ " + valorNeto)
    println("I.V.A. "+tasaIva+"%   $ " + xIva.toInt())
    println("Total        $ " + xTotal)

}
