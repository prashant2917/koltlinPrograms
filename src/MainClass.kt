val array= arrayOf(10,7,2,3,8,1)
//main function
fun main() {

print("enter input")



   val input= readLine()
    //convertDecimalToOctal(input!!.toLong())
    //reverseNum(input!!.toLong())

    if (input != null) {
       // reverseWord(input)
        //isPallindrome(input)


    }



}
/*
* checks odd number in array
* */
fun isOdd(array: Array<Int>,index:Int){
    if(index<array.size) {

        if (array[index] % 2 != 0) {
            println("${array[index]} is odd")
        }
        val nextIndex = index + 1;
        isOdd(array,nextIndex)
    }


}

/**
 * convert decimal number into array
 */
fun convertDecimalToBinary(decimal:Long){
    var  decimaNumber=decimal
    var binaryString= StringBuffer()

    while (decimaNumber>0)
    {
        binaryString.append(decimaNumber%2)
        decimaNumber=decimaNumber/2
    }
    print("binary number is ${binaryString.reverse()}")

}

/**
 * converts decimal number to hex
 */
fun convertDecimalToHex(decimal: Long){
    val hex = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    var decimalNumber=decimal
    var result=StringBuffer()
    while (decimalNumber>0){
        val rem=decimalNumber%16
        result.append(hex[rem.toInt()])

        decimalNumber=decimalNumber/16
    }

    println("hex number is ${result.reverse()}")


}

/**
 * converts decimal to octal
 */
fun convertDecimalToOctal(decimal: Long){
    val octaldigit = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7')
    var decimalNumber=decimal
    var result=StringBuffer()
    while (decimalNumber>0){
        val rem=decimalNumber%8
        result.append(octaldigit[rem.toInt()])
        decimalNumber=decimalNumber/8
    }
    println("octal number is ${result.reverse()}")
}

/**
 * reverse a given decimal number
 */
fun reverseNum(number:Long){
    var reversed=0L
    var num=number
    while (num>0){
        val digit=num%10
        reversed=reversed*10+digit
        num /= 10

    }
    println("reverse number is ${reversed}")



}

/**
 * reverse a words for given sentence
 */
fun reverseWord(sentence:String){
    val strArray=sentence.split(" ")
    var size=strArray.size
    for(i in size-1 downTo 0){
        print(" ${strArray[i]}")
    }

}

/**
 * check if string is pallindrome or not
 */
fun isPallindrome(word:String) {
    var size = word.length
    var endIndex = size - 1;
    var reverseString = ""
    for (i in endIndex downTo 0) {

        reverseString = reverseString + word[i]
    }

    if (word.equals(reverseString)) {
        println("Pallindrome")
    } else {
        println(" Not Pallindrome")
    }
}

fun largestOfThree(num1:Int,num2:Int,num3:Int){
    when{
        num1>num2 && num1>num3-> println("$num1 is greater")
        num2>num1 && num2> num3-> println("$num2 is greater")
        else-> println("$num3 is greater")
    }
}






