package Aquarium
fun main(args: Array<String>){
   val objlist= listOf(
       Aquarium("curry","sour"),
       Aquarium("soup","sweet"),
       Aquarium("soda","cold")
   )
    val fil=objlist.filter { it.heat>=8 }
    val j= listOf(fil)
    //val j=fil.toString()
    print("seerat ${j}")
}
