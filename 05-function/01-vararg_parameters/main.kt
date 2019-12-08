fun printNumbers(vararg numbers:Int){
    for (number in numbers) {
        println(number)
    }
}

fun main(args: Array<String>) {
    printNumbers(10,20,30,500)

    println("------------------")

    // pass by array
    val numbers = intArrayOf(1,2,3,4)
    // Spread Operator
    printNumbers(10,20,*numbers,30,500)
}