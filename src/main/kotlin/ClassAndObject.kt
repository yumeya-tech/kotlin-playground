// クラスの宣言。プライマリコンストラクタを使ってプロパティを宣言。
class Person(var name: String, var age: Int) {
    // メソッド
    fun introduce() {
        println("My name is $name and I am $age years old.")
    }
}

class User1 {
    var name: String = ""
}

fun main() {
    // オブジェクトの生成。プライマリコンストラクタの値を引数として渡す。
    val person = Person("Alice", 20)
    // メソッドの呼び出し。
    person.introduce() // My name is Alice and I am 20 years old.

    // オブジェクトを宣言してからプロパティを設定
    val user = User1()
    user.name = "Yamada"
    println(user.name) // Yamada
}
