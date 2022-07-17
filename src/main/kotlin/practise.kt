fun main(args: Array<String>) {

    var receivedListOfFortune: List<String> = getFortuneCookie()
    // println(a)
    for (i in 1..10) {

        println("Enter your birthday")
        var birthday = readLine()?.toIntOrNull()
        try {
            var division = birthday!! % receivedListOfFortune.size
            if (division == 5) {
                break
            }
            print(" ${receivedListOfFortune[division]}")
        } catch (e: NullPointerException) {
            print("Please enter Integer")
        }
    }
}

fun getFortuneCookie(): List<String> {
    return listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
}

