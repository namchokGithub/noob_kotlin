fun main(args: Array<String>) {
    val x: String = "555"
    when(x){
        "English" -> print("How are you ?")
        "German" -> print("Wie geht es dir?")
        else -> print("I don't know")
    }

    println("\n------------------------------")

    val y:Any? = 1.5
    val names = listOf("Jack","Neen","Amm","Teoy")
    when(y){
        in names -> print("I know that name!")
        !in 1..10 -> print("not in 1-10")
        is String -> print(x.length)
    }
}