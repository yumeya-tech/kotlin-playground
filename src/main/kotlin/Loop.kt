fun main() {
    val numbers = listOf("one", "two", "three")
    for (item in numbers) {
        println("item is $item")
    }

    for (i in 1..10) {
        println(i)
    }

    var x = 10
    while (x > 0) {
        x--
        println(x)
    }

    x = 10
    do {
        x--
        println(x)
    } while (x > 0)

    repeat(5) {
        println("Hello")
    }
}
