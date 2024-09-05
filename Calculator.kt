// Write your code here 

class Calculator (val name: String) {

  init {
    println("$name's calculator")
  }

  fun add(a: Int, b: Int): Int {
    return a + b
  }

  fun subtract(a: Int, b: Int): Int {
    return a - b
  }

  fun multiply(a: Int, b: Int): Int {
    return a * b
  }

  fun divide(a: Int, b: Int): Any {
    if (b == 0) {
      return "Error!"
    } else {
      return a / b
    }
  }

  fun power(a: Int, b: Int): Int {
    var result = 1
    for (i in 1..a) {
      result = result * b
    }
    return result
  }
}

fun main () {
  var myCalculator = Calculator("Codey")

  println(myCalculator.add(8, 11))

  println(myCalculator.subtract(8, 11))

  println(myCalculator.multiply(8, 11))

  println(myCalculator.divide(8, 0))

  println(myCalculator.power(8, 11))

}