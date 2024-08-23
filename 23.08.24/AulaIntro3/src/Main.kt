//interface  Professor{
    //fun passarConcurso()
//}

//open class Cidadao{
    //fun direitoDeveres(){
        //println("Todo cidadão tem direito e deveres")
    //}
//}

//class ProfFernando:Cidadao(), Professor{
    //override fun passarConcurso(){
        //println("Foi aprovado em um concurso em SP")
    //}
//}

//class ProfGuilherme:Cidadao(), Professor{
    //override fun passarConcurso() {
        //println("Foi aprovado em concuso no RN")
    //}
//}

//fun main() {
  //Interface, um contrato que quando assumido, deverá ser implementado

    //var guilherme = ProfGuilherme()
    //guilherme.direitoDeveres()
    //var fernando = ProfFernando()
    //fernando.passarConcurso()
//}



//fun main(){
    //var nomesAlunos = arrayListOf("Larissa", "Luna", "Deyckson")
    //nomesAlunos.add("Lucas")
    //nomesAlunos.removeAt(2)
    //nomesAlunos[1]= "Gabriel"

    //println(nomesAlunos.size)
    //println(nomesAlunos.isEmpty())
//}

//fun main(){

    //var idadeAlunos = hashSetOf(10,15,22,30,30,55,58)
    //println(idadeAlunos)

    //var mapa = hashMapOf(
        //"Leão" to "Rei da Floresta",
        //"Cachorro" to "Melhor amg do homem",
        //"Gato" to "Arranha"
    //)
    //mapa.put("Panda","Só hiberna")
    //mapa.remove("Gato")

    //for(item in mapa){
        //println(item.key)
    //}

    //println(mapa)

//}

enum class StatusPedido{
    APROVADO, REPROVADO, PENDENTE
}

class Pedido{
    var status:StatusPedido = StatusPedido.APROVADO
}

fun main(){
    val pedido01 = Pedido()
    println(pedido01.status)
}