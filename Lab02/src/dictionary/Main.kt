package dictionary

import dataClass.Date
import dataClass.isLeapYear
import dataClass.isValid
import kotlin.random.Random

fun main(){
    /* Problem 01
    val dict: IDictionary = DictionaryProvider.createDictionary(DictionaryType.TREE_SET)
    dict.add("trabant")
    println("num of words: ${dict.size()}")
    var word: String?
    while(true){
        print("what to find?")
        word = readLine()
        if (word.equals("quit")){
            break
        }
        println("Result: ${word?.let {dict.find(it)}}")
    }*/
    /* Problem 02
    var a = "Johnu Smith"
    //println("monogram: ${a.monogram()}")
    var b = a.monogram()
    println(b)
    */
    //Problem 03

    val date = Date(2001,1,31)
    println(date.isValid())
    val listOfDates = mutableListOf<Date>()
    var temp : Date
    while (listOfDates.size < 10) {
        temp = Date(Random.nextInt(-1000,1000), Random.nextInt(-12,24), Random.nextInt(-30,46))
        println("${temp.year} ${temp.month} ${temp.day}")
        if (temp.isValid()){
            listOfDates.add(temp)
        }
    }
    println("\n\nhelyes datumok\n")
    val sortedDates = listOfDates.sorted()
    sortedDates.forEach{
        println("${it.year} ${it.month} ${it.day}")
    }
    println("\n\nmegforditva\n")
    val reversedDates = sortedDates.reversed()
    reversedDates.forEach{
        println("${it.year} ${it.month} ${it.day}")
    }
}

fun String.monogram() : String = this.split(" ").map{it.first()}.joinToString("")