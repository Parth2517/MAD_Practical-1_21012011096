fun main(){
    println("Enter the number :")
    var num=readln().toInt()

    println(if (num%2==0) {
        "Even"
    }
    else {
        "Odd"
    })
}