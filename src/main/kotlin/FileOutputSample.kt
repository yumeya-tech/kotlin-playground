import java.io.File

fun writeFile(filePath: String, content: String) {
    File(filePath).bufferedWriter().use { writer ->
        writer.write(content)
    }
}

fun main() {
    val filePath = "output.txt" // 書き込みたいファイルのパス
    val content = "Hello, Kotlin!" // ファイルに書き込む内容
    writeFile(filePath, content)
}
