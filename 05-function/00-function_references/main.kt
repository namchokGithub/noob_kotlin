//  Basic Functions
fun sayMsg(msg:String):String{
    return "Message : ${msg}"
}
//  Basic Functions

// inline function / Shorthand Functions
fun addTwo(x:Int) = x+2 
fun sayMyName(name:String) = "Your name is $name"
// inline function / Shorthand Functions

// lambda function 
  val square = {number: Double -> number*number}
// lambda function


fun main(args: Array<String>) {
    println("${sayMsg("Welcome")} , ${addTwo(2)} , ${sayMyName("JACK")} , ${square(22.5)}")
}