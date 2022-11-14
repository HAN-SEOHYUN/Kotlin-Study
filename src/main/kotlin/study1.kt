fun main(args: Array<String>) {
    val calc = Calc()
    println(calc.sum(1, 5))

    val mybackpack = BackPack("Kolping", "gray")

    println(SingletonClass.str)

    val number = SingletonClass.sum(5, 10)
    println(number)

    val book1 = Book1("Kotlin", "Daniel", 10000)
    println("${book1.title} / ${book1.author} / ${book1.price}")

    val book2 = Book2()
    println("${book2.title} / ${book2.author} / ${book2.price}")
}
//main


data class Book1(val title: String, val author: String, val price: Int)

data class Book2(
    val title: String = "No Title",
    val author: String = "No Author",
    val price: Int = 0
)

class Book() {
    var title: String?
        get() {
            return title
        }
        set(value) {
            title = value
        }
    var author: String?
        get() = author
        set(value) {
            author = value
        }


    constructor(title: String) : this() {
        this.title = title
    }

    constructor(title: String, authour: String) : this(title) {
        this.author = author
    }


}

object SingletonClass {
    val str = "Hello world"

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class Calc {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class BackPack(brand: String, color: String) {
    init {
        println("브랜드는 ${brand} 이고 색상은 ${color} 입니다.")
    }
}