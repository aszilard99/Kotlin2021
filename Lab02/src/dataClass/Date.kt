package dataClass


data class Date(val year : Int, val month: Int, val day: Int) : Comparable<Date>{
    override fun compareTo(other: Date): Int {
        if (this.year == other.year && this.month == other.month && this.day == other.day) {
            return 0
        }
        if (this.year > other.year){
            return 1
        }
        if (this.year < other.year){
            return -1
        }
        if (this.month > other.month){
            return 1
        }
        if (this.month < other.month){
            return -1
        }
        if (this.day > other.day){
            return 1
        }
        else{
            return -1
        }
    }

}

fun Date.isLeapYear(): Boolean {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            return (year % 400 == 0)
        }
        else {
            return true
        }
    }
    else {
        return false
    }
}

fun Date.isValid() : Boolean {
    if (year >= 0 && month <= 12 && month > 0 && day <= 31 && day > 0) {
        if (month % 2 == 0 && day <= 30) {
            if (month == 2 && this.isLeapYear() && day <= 29) {
                return true
            }
            if (month == 2 && !this.isLeapYear() && day <= 28){
                return true
            }
            if (month != 2) {
                return true
            }
            return false
        }
        return true
    }
    return false
}