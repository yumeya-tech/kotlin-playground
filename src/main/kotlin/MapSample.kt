fun main() {
    // 変更不可
    val capitals: Map<String, String> = mapOf("France" to "Paris", "Japan" to "Tokyo")
    // 値の取得
    println(capitals["France"])

    // 変更可
    val mutableCapitals: MutableMap<String, String> = mutableMapOf("France" to "Paris")
    // 値の設定
    mutableCapitals["Japan"] = "Tokyo"
}
