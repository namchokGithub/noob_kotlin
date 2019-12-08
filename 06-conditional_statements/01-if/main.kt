fun main(args: Array<String>) {
    val str:String = "Hello!"
    if(str.length==0){
        print("The string is empty")
    }else if(str.length<5 ){
        print("The string is short")
    }else{
        print("The string is long!")
    }

    println("\n------------------------")

    if(str.length==0) print("The string is empty")  else print("The string is not empty")

    println("\n------------------------")

    val value = if(str.length==0) "The string is empty" else "The string is not empty" 
    println(value)
}