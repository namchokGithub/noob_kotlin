class Student_profile(std_id:Int,std_code:Int,first_name:String,last_name:String,faculty:String,major:String,score:Double){

    public var std_id:Int
    public var std_code:Int
    public var first_name:String
    public var last_name:String
    public var faculty:String
    public var major:String
    public var score:Double
    init{
        this.std_id = std_id
        this.std_code = std_code
        this.first_name = first_name
        this.last_name = last_name
        this.faculty = faculty
        this.major = major
        this.score = score
    }

    public fun show_infor(){
        println("id : ${this.std_id} , code :  ${this.std_code} , first_name : ${this.first_name} ,last_name : ${this.last_name} ,faculty :  ${this.faculty} , major : ${this.major} ,score : ${this.score}")
    }

}

interface Grader_management{
    public fun cal_grade(std : Student_profile):String{
        return if(std.score >= 80 )"A" else if (std.score >= 70 )"B" else if (std.score >= 60) "c" else if (std.score >= 50 )"D" else "F"        
    }
    public fun get_show_grade_menu(team_06: ArrayList<Student_profile>):Int{
        println("Welcome to Calculate Grader , enter number on menu")
        println("\t1.) to show all students")
        println("\t2.) to add students")
        println("\t3.) to calculate grade all students")
        println("\t4.) to delete student at std_id")
        println("\t0.) to Exit")
        print("Enter number on menu : ")
        val number_menu:Int = readLine()!!.toInt()
        return number_menu
    }
    public fun add_student(team_06: ArrayList<Student_profile>){
        print("Enter std_id : ")
        val std_id:Int = readLine()!!.toInt()

        print("Enter std_code : ")
        val std_code:Int = readLine()!!.toInt()

        print("Enter first_name : ")
        val first_name:String = readLine()!!.toString()

        print("Enter last_name : ")
        val last_name:String = readLine()!!.toString()

        print("Enter faculty : ")
        val faculty:String = readLine()!!.toString()

        print("Enter major : ")
        val major:String = readLine()!!.toString()

        print("Enter score : ")
        val score:Double = readLine()!!.toDouble()

        val std : Student_profile = Student_profile(std_id,std_code,first_name,last_name,faculty,major,score)

        team_06.add(std)
    }

    public fun show_all_student(team_06: ArrayList<Student_profile>){
        
        if(team_06.size==0){
            println("No students to show")
        }else{
            println("List of students : ${team_06.size}")
        }
        for (std in team_06) {
            std.show_infor()
        }
    }

    public fun del_student(team_06: ArrayList<Student_profile>){
        
        if(team_06.size==0){
            println("No students to delete")
        }else{
            print("Enter std_id : ")
            var check : Int = 0
            val id:Int = readLine()!!.toInt()
            for ((index,std) in team_06.withIndex()) {
                if(std.std_id == id){
                    team_06.removeAt(index)
                    println("Delete complete")
                    check++
                }
            }
            if(check==0){
                println("Not Found")
            }
        }
    }

    public fun show_all_student_grade(team_06: ArrayList<Student_profile>){
        if(team_06.size==0){
            println("No students to report grade")
        }else{
            println("List of students : ${team_06.size}")
            println(" <------> ")
        }
        for (std in team_06) {
            std.show_infor()
            println("Grade : ${this.cal_grade(std)}")
            println(" <------> ")
        }
    }
}

class Reg_controller : Grader_management{
     public fun get_show_reg_menu():Int{
        println("Welcome to Reg system , enter number on menu")
        println("\t1.) to Calculate grade menu")
        println("\t0.) to Exit")
        print("Enter number on menu : ")
        val number_menu:Int = readLine()!!.toInt()
        return number_menu
    }
    public fun show_error(){
        println("your request not found")
    }
}

// cast_int_to_boolean 
  val cast_int_to_boolean = {number: Int -> !(number==0)}
// cast_int_to_boolean

// grader_module 
  fun grader_module(team_06 : ArrayList<Student_profile>, reg : Reg_controller){

    
    
    var number_menu : Int = reg.get_show_grade_menu(team_06)

    while(cast_int_to_boolean(number_menu)){
       
        print("\u001Bc")

        when(number_menu){
            !in 0..4 -> reg.show_error()
            1 -> reg.show_all_student(team_06)
            2 -> reg.add_student(team_06)
            3 -> reg.show_all_student_grade(team_06)
            4 -> reg.del_student(team_06)
            0 -> println("exit grade menu")
        }
        number_menu = reg.get_show_grade_menu(team_06)
    }
  }
// grader_module


fun main(args: Array<String>) {

    var team_06 = ArrayList<Student_profile>()
    var reg : Reg_controller = Reg_controller()
    var number_menu : Int = reg.get_show_reg_menu()

    

    while(cast_int_to_boolean(number_menu)){

        print("\u001Bc")

        when(number_menu){
            !in 0..1 -> reg.show_error()
            1 -> grader_module(team_06,reg)
            0 -> println("exit reg menu")
        }
        number_menu = reg.get_show_reg_menu()
    }
}

// kotlinc main.kt -include-runtime -d main.jar && java -jar main.jar