fun add(x: Int,y: Int): Int {
    return x+y
}
fun sub(x: Int,y: Int): Int {
    return x-y
}
fun div(x: Int,y: Int): Int {
    return x/y
}
fun mul(x: Int,y: Int): Int {
    return x*y
}
fun main() {
    println("Enr_no : 21012011096 ")
    val x = 4
    val y = 5
    println("Addition of $x and $y = "+ add(x,y))
    println("Subtraction of $x and $y = "+ sub(x,y))
    println("Multiplication of $x and $y = "+ mul(x,y))
    println("Division of $x and $y = "+ div(x,y))
}
