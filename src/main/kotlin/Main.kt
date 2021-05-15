fun main() {
    // val is constant
    val x = 10
    println("X = $x")
    // var is variable and F means its a Float type
    var y = 2F
    y = x.toFloat() / 2
    println("Y = X = $y")
    // Different types can divide
    val z = y/x
    println("Z = $z")
}