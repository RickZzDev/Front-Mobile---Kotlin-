package br.senai.sp

fun main(args: Array<String>) {

    for(x in 0..20) print(x)

    var cidades = arrayOf("Jandira","Barueri","Itapevi")
    println()
    for(cidade in  cidades){
        println(cidade)
    }

    var escola = "Senai Jandira"

    for((x,letra) in escola.withIndex()){
        println(letra + "-" + x)
    }


}