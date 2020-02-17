package br.senai.sp

class Aluno(nome:String,
            email:String,
            idade:Int) {

     var nome:String
     var email:String
     var idade:Int

    init {
        this.nome = nome
        this.email = email
        this.idade = idade
    }

}