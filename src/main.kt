fun main (){
    namesOfGirls(arrayOf("Anna", "martha", "asha", "Sara"))

    cities(arrayOf("harara", "mumbai", "dodoma", "jakarta"))

    sum(arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62))
    girls(arrayOf("martha", "sara", "anna"))


}
fun namesOfGirls(name: Array<String>){
    println(name.contentToString())


}
fun cities(names: Array<String>){
    names.forEach { names ->
        println(names .capitalize())

        }
}

fun sum(number: Array<Int>){
    var answer= number[2] + number[5]
    println(answer)

    var sell= number.indexOf(158)
    println(sell)
    var sum= number.sortedArray()
    println(sum.contentToString())

}
fun girls(names: Array<String>): Array< String>{
    var names= names
    println(names.contentToString())
    return names
}

