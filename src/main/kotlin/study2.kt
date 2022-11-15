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

    var map2 = HashMap<String, String>()
    map2["A"] = "Joongsoo"
    map2["B"] = "Younghwan"
    map2["C"] = "Minji"

    println(map2["A"])
    println(map2["B"])
    println(map2["C"])

    var map3 = hashMapOf<String, String>()
    map3["A"] = "Joongsoo"
    map3["B"] = "Joongsoo"
    map3["C"] = "Joongsoo"

    println(map3["A"])
    println(map3["B"])
    println(map3["C"])

    var intRange = IntRange(0,10)
    var charRange = CharRange('a','e')
    var longRange = LongRange(11,20)

    var intRange1 = 0..10
    var charRange1 = 'a' .. 'e'


    for(i in intRange)
        println(i)

    for(i in charRange)
        println(i)

    for(i in longRange)
        println(i)

}