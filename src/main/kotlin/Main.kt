import java.security.KeyStore.TrustedCertificateEntry

fun main(){
    // 1(i)
    var stringOne = " AkiraChix"
    stringOne[4]
    for (x in stringOne){
        println(x)
    }
    println(stringOne.length)
    // string that cannot be changed
    val stringTwo = "Akirachix"
    test(9)
    test(3)
    test(7)
    // printing out the highest value
//    var output = arrayOf<Int>(12, 34, 65,45,65)
//    println(output.max())
    largest(arrayOf(12, 34, 65,45,65))
    order()
    val person1 = Human("Yvette", "female", "Black", "5'3",60)
    (person1.identity())

}
// acidity test
fun test(value: Int){
    if (value == 7){
        println("Neutral")
    }
    if( value < 7){
        println("Acidic")
    }
    if(value > 7) {
        println("Alkaline")
    }
}
// largestvalue
fun largest(output:Array<Int>){
//    var output = arrayOf<Int>()
    println(output.max())

}
fun order(){
    var names = arrayOf("Anita B", "AdaLab", " HopperLab", "Rwanda", "Kenya", "tanzania")
    (names.sortedArrayDescending())
    println(names.contentToString())
}
class Human(var name:String, var gender:String, var color:String, var height:String, var weight:Int){
    fun rest(){
        println("Sleep eight hours a day")
    }
    fun identity( ){
//        gender = "female"
        println(" I am ${gender} and my name is ${name}")

    }
}
data class Book(var author:String, var title:String, var pages:Int, var yearPublished:Long )
