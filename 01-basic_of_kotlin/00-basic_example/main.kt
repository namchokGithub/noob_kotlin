fun printHello(name: String?): Unit {
    if(name != null)
        println("Hello ${name}")
}

fun double(x:Int):Int = x*2

fun main(args: Array<String>) {
    println("--------- printHello ---------")
    printHello("Jhon")
    printHello(null)
    println("------------ double ----------")
    println("Double : ${double(2)}")
    println("------ actually checks -------")
    var a: String? = "abc"
    a = null
    var b: String? = "abc"
    a?.equals(b) ?: (b === null)
    println("------------------------------")

}