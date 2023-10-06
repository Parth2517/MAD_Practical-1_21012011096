import java.util.*
fun main() {
    // 1. Using 'arrayOf()' function
    val array1 = arrayOf("Mango", "Banana", "Cherry", "Chiku")

    // 2. Using 'IntArray' constructor
    val array2 = IntArray(5) { i -> i + 1 }

    // 3. Using 'listOf()' and 'toIntArray()' functions
    val list = listOf(6, 7, 8, 9, 10)
    val array3 = list.toIntArray()

    // 4. Using 'Array' constructor with lambda expression
    val array4 = Array(5) { i -> i * 2 }

    //5. Using intArrayOf() function
    val array5 = intArrayOf(10, 20, 30, 40, 50)

    // 6. 2D array using arrayOf() function
    val array6 = arrayOf(arrayOf(1, 2), arrayOf(3, 4))


    // Printing the arrays
    println("Enr_no : 21012011096 ")
    println("Array-1 using 'arrayOf()' function: ${array1.joinToString(", ", "[", "]")}")
    println("Array-2 using 'IntArray' Constructor: ${array2.joinToString(", ", "[", "]")}")
    println("Array-3 Using 'listOf()' and 'toIntArray()' functions: ${array3.joinToString(", ", "[", "]")}")
    println("Array-4 Using 'Array' constructor with lambda expression: ${array4.joinToString(", ", "[", "]")}")
    println("Array-5 Using 'intArrayOf()' function: ${array5.joinToString(", ", "[", "]")}")
    println("2D array using Arrays.deepToString(): ${Arrays.deepToString(array6)}")
    println("2D array using contentDeepToString(): ${array6.contentDeepToString()}")

    val array = arrayOf(9, 5, 7, 1, 3)

    // Sorting the array using inbuilt function
    val sortedArray1 = array.sorted()
    println("Sorted Array using inbuilt function: ${sortedArray1.joinToString()}")

    // Sorting the array without using inbuilt function (Bubble Sort)
    val sortedArray2 = bubbleSort(array)
    println("Sorted Array without inbuilt function: ${sortedArray2.joinToString()}")
}

fun bubbleSort(arr: Array<Int>): Array<Int> {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}
=======
fun main(){
    println("Enr_no : 21012011096 ")
    var a2= arrayOf(5,4,3,2,1)
    var a3= intArrayOf(8,9,7)
    var a4=Array(5){0}
    println("creste Array using arrayof=${a2.contentToString()}\n")
    println("creste Array using intarrayof=${a3.contentToString()}\n")
    println("creste Array using Arry=${a4.contentToString()}\n\n")
    var a1= arrayListOf<Int>()
    print("Enter your array size=")
    var size= readln().toInt()
    println("enter your $size elements!!")
    for(i in 0..(size-1)){
        print("enter a[$i]=")
        a1.add(readln().toInt())
    }
    println("Before sorting array is")
    a1.forEach{print(it,)}
    println("\nafter sorting using build-in function\n")
    a1.sort()
    a1.forEach{print(it,)}
    var a5= arrayOf(5,4,3,2,1)
    println("\nBefore sorting array is\n")
    a5.forEach { print(it,) }
    var temp:Int
    for(i in 0 .. size-1){
        for(j in 0 .. i){
            if(a5[i]<a5[j]){
                temp=a5[i]
                a5[i]=a5[j]
                a5[j]=temp
            }
        }
    }
    println("\nafter sorting without using build-in function\n")
    a5.forEach { print(it,) }
}
