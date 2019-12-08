open class Student(id:Int,first_name:String,last_name:String){
    protected var id : Int
    protected var first_name : String
    protected var last_name : String

    init{
        this.id = id
        this.first_name = first_name
        this.last_name = last_name
    }

    public fun show_info(){
        println("${this.get_id()} ${this.get_first_name()} ${this.get_last_name()}")
    }

    public fun get_id():Int{
        return this.id
    }

    public fun get_first_name():String{
        return this.first_name
    }

    public fun get_last_name():String{
        return this.last_name
    }

    public fun set_id(id:Int){
        this.id = id
    }

    public fun set_first_name(first_name:String){
        this.first_name = first_name
    }

    public fun set_last_name(last_name:String){
        this.last_name = last_name
    }

}

class Thai_student: Student {

    private var market_name : String

    constructor(id:Int,first_name:String,last_name:String,market_name:String)
        :super(id,first_name,last_name){
            this.market_name = market_name
        }

    public fun shopping(){
        println("I'am shopping at ${this.market_name}")
    }
}

fun main(args: Array<String>) {
    val jojo = Thai_student(12,"Jojo","Stand","lamptong")
    jojo.show_info()
    jojo.set_first_name("JojoPop")
    jojo.set_id(10)
    jojo.set_last_name("Steam")
    jojo.show_info()
    jojo.shopping()
}