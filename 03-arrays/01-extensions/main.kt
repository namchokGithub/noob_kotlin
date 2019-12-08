fun main(args: Array<String>) {
    val double = doubleArrayOf(1.5,3.0)
    println(double.average()) // prints 2.25

    val ints = intArrayOf(1,4)
    println(ints.average()) // prints 2.5

    println("-----------------------------------------")


    val arr = doubleArrayOf(150.23,563.1,11.2,2.15,0.03,0.667)

    for (i : Double in arr) {
        print("$i ")
        if(i==arr.last())
            print("last is $i")
        if(i==arr.first())
            print("first is $i \n")
    }

    println("-----------------------------------------")

    
}