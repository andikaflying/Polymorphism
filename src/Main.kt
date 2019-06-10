/**
 * Polymorphism is changing variable form to be any form
 */
fun main(args: Array<String>) {
    firstExample()
//    secondExample()
}

fun firstExample() {
    //Make Car object to SUV object (SUV is child class)
    var firstCar: Car = SUV()
    firstCar.displayInfo()
    //This is native Car object
    var secondCar: Car = Car()
    secondCar.displayInfo()
}

fun secondExample() {
    //Change CarActions interface to Car object
    var someCar: CarActions = Car()
    //This is error because displayInfo is not part of CarActions interface
//    someCar.displayInfo()
    //We only can call methods from CarActions interface. Because someCar is Car object, someCar will return value from implemented methods on Car class
    someCar.printBrand()
    someCar.printOrigin()
}