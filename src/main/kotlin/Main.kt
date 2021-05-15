fun main() {
    // val is constant
    val x = 10
    println("X = $x")

    // var is variable and F means its a Float type
    val y: Float = x.toFloat() / 2
    println("Y = X = $y")

    // Different types can divide
    val z = y/x
    println("Z = $z")

    println("STARS: ")
    // Type safety + give default value if null, NULL safety
    // val input: Int = (readLine() ?: "0").toInt()
    // for loops :)
    for (i in 0..3) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }

    // Lists
    val shoppingList = mutableListOf("Laptop", "Mobile", "PC")
    shoppingList.add("Watch")
    var index = 0
    while(index < shoppingList.size) {
        print(shoppingList[index]+",")
        index++
    }
    for (i in shoppingList) {
        println(i)
    }
}