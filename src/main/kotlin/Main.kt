import kotlin.coroutines.coroutineContext

fun main(){
printName("Naserian")
    remainder(54 ,4)
    add(12 ,23 ,45 ,56)
    facts("I love technology")


}
fun printName(name:String){
    println("Hello $name")
}
fun remainder(b: Int,c: Int) {

    var remainder = b % c
    println(remainder)
}
 fun add(a:Int,b:Int,c:Int,d:Int){
     var sum = a+b+c+d
     println(sum)
 }
fun facts(text: String){
    var result =text
    println(result)
}















