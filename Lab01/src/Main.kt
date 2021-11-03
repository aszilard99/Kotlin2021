import java.util.*

fun main(){
    println("lab01")
    var a = 5
    var b = 2
    println("$a + $b = ${a+b}")

    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in daysOfWeek) {
        val a = day.first()
        if (a.toString().equals( "T")){
            println(day)
        }
    }

    val daysWithT = daysOfWeek.filter { it.startsWith("T") }
    println("days that start with T $daysWithT")
    val daysWithE = daysOfWeek.filter { it.contains("e") }
    println("days containing e $daysWithE")
    val daysSixChars = daysOfWeek.filter { it.length == 6 }
    println("days 6 length $daysSixChars")

    val num = 56
    println("is $num prime: ${isPrime(2)}")

    println("\nprinting primes in range")
    for (x in 5..25){
        if (isPrime(x)){
            println(x)
        }
    }
    println("printed primes in range \n")

    val numList = listOf(1,2,3,4,5)
    val evenNums = filterEvenNumbers(numList)
    println("even numbers are $evenNums from the list of $numList")

    val doubleIntList = numList.map{it*2}
    println("the list $numList doubled $doubleIntList")

    println("days with uppercase ${daysOfWeek.map{ it.uppercase(Locale.getDefault()) }}")

    println("first char of days with uppercase ${daysOfWeek.map{ it.first().uppercase(Locale.getDefault()) }}")

    val dayLengthList = daysOfWeek.map{ it.length }
    println("day length $dayLengthList}")
    println("average day char length ${dayLengthList.average()}")

    val mutableDaysOfWeek = daysOfWeek.toMutableList()

    println("days not containing  n ${mutableDaysOfWeek.filter{!it.contains("n")}}")

    
}

fun filterEvenNumbers(list : List<Int>) : List<Int> = list.filter { it%2 == 0 }



fun isPrime(num : Int) : Boolean{
    for (i in 2..num / 2){
        if (num%i == 0) {
            return false
        }
    }
    return true
}