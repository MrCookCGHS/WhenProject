fun main() {

    var number:Int = 1
    var numberBinary = "Binary"

    print("Enter a number 1 - 10 using your keypad")
    number = readLine()!!.toInt()

    when (number) {
        1 -> numberBinary = "0001"
        2 -> numberBinary = "0010"
        3 -> numberBinary = "0011"
        4 -> numberBinary = "0010"
        5 -> numberBinary = "0011"
        6 -> numberBinary = "0100"
        7 -> numberBinary = "0101"
        8 -> numberBinary = "0110"
        9 -> numberBinary = "0111"
        10 -> numberBinary = "0110"
        !in 1..10 -> "try that again"
        else -> "error.  error"
    }
    println("You entered $number.  In binary, $number is written in 4 bits is $numberBinary")
}