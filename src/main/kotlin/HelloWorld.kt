import java.util.Random

fun main(args: Array<String>){
    println("Hello World!")

    var str = "10"
    var number:Int = str.toInt()
    println(number)

    var num:Int = 10
    if(num == 0){
        println("num은 0입니다")
    }else if(num == 10){
        println("num은 10입니다")
    }else{
        println("num은 0과 10이 아닙니다")
    }

    var a = 10
    var b = 20

    var c = if(a==b){
        println("if 문의 코드블럭실행")
        "a는 b와 같은 값입니다"
    }else{
        println("else 문의 코드블럭실행")
        "a는 b와 다른 값입니다"
    }

    var num3:Int = 10

    when(num3){
        0-> println("0입니다")
        5-> println("5입니다")
        10-> println("10입니다")
        else->{
            println("0,5,10 에 속하지 않음")
        }
    }

    var arr2:IntArray = intArrayOf(6,7,8,9)
    when(num3){
        0,1 ->println("0혹은 1입니다")
        in 2..5 ->println("2와 5사이의 수 입니다")
        in arr2 ->println("arr 배열에 속합니다")
        !in arr2 ->println("arr 배열에 속하지 않습니다")

    }

    val num4:Int = 50
    val digitStr = digit(num4)

    println(digitStr)

    var i = 0
    while(i<10){
        println(i)
        i++
    }

    val gen = NumberGenerator()

    do{
        val number = gen.generateRandomNumber()
        println(number)
    }while(number % 2==0)

    var arr = arrayOf("A","B","C","D","E")
    for(i in arr){
        println(i)
        if(i == "C")
            break
    }


}

fun digit(num:Int) = when(num){
    in 0..9 -> "한자리수"
    in 10..99 -> "두자리수"
    in 100..999 -> "세자리수"
    else -> "Out of range"
}

class NumberGenerator{
    val random = Random()

    fun generateRandomNumber() : Int{
        return random.nextInt(100)
    }
}



