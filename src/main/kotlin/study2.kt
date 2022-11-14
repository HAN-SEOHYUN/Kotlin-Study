fun main(args:Array<String>){
    var list1 = List(5, {i->i+i})
    println(list1)

    var list2 = listOf(0,1,2,3,4)
    println(list2)

    var list3 = listOf("A","B","C","D","E")
    for(idx in 0..(list3.size-1)){
        println(list3[idx])
    }

    var map = mapOf(Pair("A","Seohyun"),
    Pair("B","Hyerim"),
    Pair("C", "Jiwon"),
    Pair("D","Jooeun"))

    println(map["A"])
    println(map["B"])
    println(map["C"])
    println(map["D"])
}