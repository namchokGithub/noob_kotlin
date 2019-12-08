fun main(args: Array<String>) {

    /*
        Kotlin type     Factory function                JVM type
        ---------------------------------------------------------
        BooleanArray    booleanArrayOf(true, false)     boolean[]
        ByteArray       byteArrayOf(1, 2, 3)            byte[]
        CharArray       charArrayOf('a', 'b', 'c')      char[]
        DoubleArray     doubleArrayOf(1.2, 5.0)         double[]
        FloatArray      floatArrayOf(1.2, 5.0)          float[]
        IntArray        intArrayOf(1, 2, 3)             int[]
        LongArray       longArrayOf(1, 2, 3)            long[]
        ShortArray      shortArrayOf(1, 2, 3)           short[]
     */

    println("create an array")

    /* create an array */
    val a = arrayOf(1,2,3) // creates an Array<Int> of size 3 containing [1, 2, 3]
    for (i in a) {
        print("$i ")
    }

    println("\ncreate an array using a closure")

    /* create an array using a closure */
    val b = Array(3){i->i*2}  // creates an Array<Int> of size 3 containing [0, 2, 4]
    for (i in b) {
        print("$i ")
    }

    println("\ncreate an uninitialized array ")

     /* create an uninitialized array */
    val c = arrayOfNulls<Int>(3)  // creates an Array<Int?> of [null, null, null]
    for (i in c) {
        print("$i ")
    }
    c[0] = 1
    c[1] = 5
    c[2] = 9
    for (i in c) {
        print("$i ")
    }

}