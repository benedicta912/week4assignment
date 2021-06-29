fun main(){
    println(evenlyspaced(3,4,6))
}

fun evenlyspaced(a: Int, b: Int, c: Int): Boolean{
    var num1 = a - b
    var num2 = b - c
    return (num1==num2)
}