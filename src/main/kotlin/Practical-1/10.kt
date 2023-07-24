class Car(
        val type: String,
        val model: String,
        val price: Double,
        val owner: String,
        var milesDrive: Int
) {
    val originalPrice: Double = price
    val currentPrice: Double
        get() = originalPrice - (milesDrive * 0.001)

    fun getCarInformation() =
            "Type: $type, Model: $model, Price: $price, Owner: $owner, Miles driven: $milesDrive"

    fun displayCarInfo() {
        println(getCarInformation())
        println("Original Price: $originalPrice")
        println("Current Price: $currentPrice")
    }
}

fun main() {
    println("Enr_no : 21012011096 ")
    val car = Car("Toyota", "Fortuner", 150000.0, "John", 1000)

    println("Type: ${car.type}")
    println("Model: ${car.model}")
    println("Price: ${car.price}")
    println("Owner: ${car.owner}")
    println("Miles Driven: ${car.milesDrive}")

    println("\nCar Information:")
    println(car.getCarInformation())

    println("\nOriginal Car Price: ${car.originalPrice}")
    println("Current Car Price: ${car.currentPrice}")


    println("\nComplete Car Info:")
    car.displayCarInfo()
}