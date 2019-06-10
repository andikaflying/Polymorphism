
open class Car : CarActions {

    public var name: String = "No name"
    public var height: Double = 0.0
    public var width: Double = 0.0

    public fun displayInfo() {
        println("Name : " + name + ", Height : " + height + ", Width : " + width)
    }

    override fun printBrand() {
        println("This car is Toyota")
    }

    override fun printOrigin() {
        println("This car is from Japan")
    }
}