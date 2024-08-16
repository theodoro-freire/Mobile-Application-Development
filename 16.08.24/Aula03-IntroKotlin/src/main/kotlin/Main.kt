//package org.exam
//
////fun mostrarMsg(nome:String, sobrenome:String , cpf:Int) {
//    //println("Olá...$nome $sobrenome")
////}
//
////fun calcIdade(anoNasc:Int):Int{
//   // var idade = 2024 - anoNasc
//    //return idade
////}
//
////fun main() {
//    //mostrarMsg("Fernando" , "Abreu", 343423498)
//    //println(calcIdade(anoNasc = 2000))
////}
//
//class Casa{
//    //Propriedades/Atributos
////    var cor:String = ""
////    var vagasGaragem:Int = 0
//
//    var cor:String
//    var vagasGaragem:Int
//
//    constructor(cor:String , vagasGaragem:Int){
//        this.cor = cor
//        this.vagasGaragem = vagasGaragem
//    }
//
//
//    //Métodos
//    fun detalhesCasa(){
//        println("COR: ${cor} - Vagas ${vagasGaragem}")
//    }
//
//    fun abrirJanelas(){
//        println("Abrindo janelas...")
//    }
//
//    fun abrirPortas(){
//        println("Abrindo portas...")
//    }
//
//    fun abrirCasa(){
//        this.abrirPortas()
//        this.abrirJanelas()
//    }
//}
//
//fun main() {
//   var casaDoPresidente = Casa("Amarela", 5)
//    casaDoPresidente.detalhesCasa()
//
//
////    casaDoPresidente.cor = "Amarela"
////    casaDoPresidente.detalhesCasa()
////    casaDoPresidente.abrirCasa()
//
////    var casaDoPrefeito = Casa()
////    casaDoPrefeito.cor = "Azul"
////    casaDoPrefeito.detalhesCasa()
//}

open class  Animal(){
    //Propriedades
    var cor:String = ""
    var idade:Int = 0
    var peso:Double = 0.00

    //Métodos..
    open fun dormir(){
        println("Dormindo...")
    }
}

class Cachorro : Animal(){

    var raca:String = ""

    //metodos
    override fun dormir(){
        super.dormir()
        println("Dormindo com um cachorro...")
    }
    fun latir(){
        println("Latindo...")
    }

}

fun main(){
    var cachorro1 = Cachorro()
    cachorro1.cor = "Caramelo"
    cachorro1.peso= 3.400
    cachorro1.idade=2
    cachorro1.raca= "vira lata"
    cachorro1.dormir()
}