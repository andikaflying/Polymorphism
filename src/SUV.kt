

class SUV : Car() {
    private var isLarge: Boolean = false

    init {
        height = 50.0
        width = 500.0
        name = "SUV Car"
    }

    public fun printSUV() {
        println("This is SUV car")
    }

    fun isSUVLarge() : Boolean {
        return isLarge
    }

    fun setSUVLarge(isLarge : Boolean) {
        this.isLarge = isLarge
    }
}