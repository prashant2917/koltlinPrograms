val array= arrayOf(10,7,2,3,8,1)
fun main() {


print("enter input")
   val input= readLine()
    //convertDecimalToOctal(input!!.toLong())
    //reverseNum(input!!.toLong())

    if (input != null) {
        reverseWord(input)
    }



}
fun isOdd(index:Int,n:Int){
    if(index<n) {

        if (array[index] % 2 != 0) {
            println("${array[index]} is odd")
        }
        val nextIndex = index + 1;
        isOdd(nextIndex, n)
    }


}

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

fun reverseWord(sentence:String){
    val strArray=sentence.split(" ")
    var size=strArray.size
    for(i in size-1 downTo 0){
        print(" ${strArray[i]}")
    }
}
