import java.io.File

fun readFile(filePath: String) {
    File(filePath).bufferedReader().use { reader ->
        val content = reader.readText()
        println(content)
    }
}

fun main() {
    val filePath = "input.txt" // 読み込みたいファイルのパス
    readFile(filePath)
}
