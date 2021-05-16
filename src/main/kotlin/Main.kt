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
    val input: Int = try {
        // try to parse
        (readLine() ?: "0").toInt()
    } catch (e: Exception) {
        // returned default value
        0
    }
    // for loops :)
    for (i in 0..input) {
        for (j in 0..i) {
            print("*")
        }
        println()
    }

    // Lists
    val shoppingList = mutableListOf("Laptop", "Mobile", "PC")
    shoppingList.add("Watch")
    for (i in shoppingList) {
        println(i)
    }
    val result: Int = loopWithWhile(shoppingList)

    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

    // anonymous class
    val bear = object : Animal("Bear") {
        override fun makeSound() {
            println("Roooar!");
        }
    }
    bear.makeSound()

    // lambda functions
    var count: Int = shoppingList.count {
        item ->
        item.isNotEmpty()
    }

    println("Shopping list has $count items")

    count = shoppingList.customCount { item -> item.isNotEmpty() }
    println("Shopping list has $count items (custom counter)")
}

// custom counter lambda function
// T is a Generic for any type, here String (now we can pass int list, string list ...)
fun <T> List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for (i in this)
        if(function(i))
            counter++
    return counter
}

fun loopWithWhile(stringList: List<String> = listOf()): Int {
    var index: Int = 0
    while(index < stringList.size) {
        print(stringList[index])
        when(index) {
            stringList.size - 2 -> print(" and ")
            stringList.size - 1 -> print("")
            else -> print(", ")
        }
        index++
    }
    print("\n");
    return index
}