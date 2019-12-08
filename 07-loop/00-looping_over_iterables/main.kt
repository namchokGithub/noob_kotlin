fun main(args: Array<String>) {

    val list = listOf("Hello","World","!")
    for (str in list) {
        print(str)
    }

    println("\n------------")

    for (i in 0..9) {
        print(i)
    }

    println("\n------------")

    for ((index,element) in list.withIndex()) {
        if (element == list.last()){
            print("\"$element\" at last - index $index")
        }else if(element == list.first()){
            println("\"$element\" at first - index $index")
        }else{
            println("\"$element\" at index $index")
        }
    }

    println("\n------------")

    list.forEach{
        println("forEach -> ${it.toString()}")
    }

}