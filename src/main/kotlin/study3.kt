class withTestClass {
    var number = 10

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

class RunTestClass {
    var number = 10

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun main(args: Array<String>) {
    var testClass = withTestClass()
    var num = with(testClass) {
        number = number + 10
        sum(10, number)
    }

    println(num)

    var num1 = run {
        1 + 2
    }
    println(num1)

    run {
        var a = 10
        println(a)
    }

    var testObj = RunTestClass()
    var num2 = testObj.run{
        number += 20
        sum(number,20)
    }
    println(num2)
}