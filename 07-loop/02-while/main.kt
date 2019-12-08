fun main(args: Array<String>) {

    var i :Int = 0
    var count_continute : Int = 0

    while(i<10){

        if(i==1){
            count_continute++
            println("(i==1) i : $i , continue : $count_continute")
            if(count_continute==3){
                i++
            }
            continue
        }

        println("i : $i , continue : $count_continute")

        if(i==5){
            println("(i==5) i : $i , continue : $count_continute")
            break
        }

        i++

    }

    println("Sum of continue : $count_continute ")
    println("Sum of i : $i ")
}