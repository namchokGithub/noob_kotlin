interface If_builder{
     fun show_msg()
     fun show_name(){
        print("IF")
    }
}

interface M_builder{
     fun show_msg()
     fun show_name(){
        print("M")
    }
}

class Buu : If_builder , M_builder {

    override fun show_msg(){
        print("Is have ")
        super<If_builder>.show_name()
        println(" and ")
        super<M_builder>.show_name()
        println("\n------")

    }

    override fun show_name(){
        println("Buu")
    }

}

fun main(args: Array<String>) {
    val buu = Buu()
    buu.show_msg()
    buu.show_name()
}