val s = "abc"
val str = "$s.length is ${s.length}" // evaluates to "abc.length is 3"
fun main(args: Array<String>) {
    println(str)
}