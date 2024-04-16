fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    // Listにはaddできない。（コンパイルエラー）
    // numbers.add(6)
    // Listの値を取得する
    println(numbers[0])

    val strings: MutableList<String> = mutableListOf("one", "two", "three")
    // MutableListにはaddできる。
    strings.add("four")
    println(strings[0])

    val numbersSet: Set<Int> = setOf(1, 2, 3, 1)
    // Setには重複しない要素が保持される
    println(numbersSet) // [1, 2, 3]
    // 値が存在しているかの確認ができる
    println(numbersSet.contains(1)) // true

    val stringsSet: MutableSet<String> = mutableSetOf("one", "two", "three")
    // MutableSetにはaddできる
    stringsSet.add("four")
}
