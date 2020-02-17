package br.senai.sp

fun main(args: Array<String>) {
    var opcao = 2

    when(opcao){
        1 ->println("Java")
        2 ->println("Kotlin")
        3 -> println("C#")
        else->{
            println("Opcao incorreta")
        }
    }
}