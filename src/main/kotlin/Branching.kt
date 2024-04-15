fun main() {
    var number = 0
    if (number > 0) {
        println("正の数")
    } else if (number < 0) {
        println("負の数")
    } else {
        println("ゼロ")
    }

    val a = 5
    val b = 10
    var max = if (a > b) a else b

    var x = 1
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is neither 1 nor 2")
    }

    var result = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> "x is neither 1 nor 2"
    }
}
