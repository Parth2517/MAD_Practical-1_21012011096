fun main() {
    println("Enr_no : 21012011096 ")
    val array = arrayListOf(10, 5, 20, 15, 30)
    for(a in array){
        println(a)
    }
    val maxNumber = array.max()

    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}