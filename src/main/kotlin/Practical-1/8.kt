class Student(var Enr_no : Int)
{
    var Name : String=""
    constructor(n:String):this(96)
    {
        Name  = n
    }
}
class person()
fun main(){
    val a = Student("Parth")
    println(a.Enr_no)
    println(a.Name)
}