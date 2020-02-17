package br.senai.sp

import java.util.*

fun main(args: Array<String>) {

//    Chamando a classe
//    Enviando parametros pelo construtor
    val pedro = Aluno("pedro","pedro@gmail",25)


    println(pedro.nome)

    println(queDiaEhHoje())
    var somados = soma(5,10)
    println("a soma de 5 e 10 é " + somados)
}

fun queDiaEhHoje():Date{
    return Date()
}

fun soma(valor1:Int,valor2:Int):Int{
    var soma = valor1 + valor2
    return soma
}

