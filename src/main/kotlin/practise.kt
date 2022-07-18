fun main(args: Array<String>) {
    //var receivedListOfFortune: List<String> = getFortuneCookie()
    repeat (10) { var birthday = getBirthday()
       var singleFortune= getFortuneCookie(birthday)
        println("hey $singleFortune")
    /*    try {
            var division = birthday!! % receivedListOfFortune.size
            if (division == 5) {
                break
            }
            print(" ${receivedListOfFortune[division]}")
        } catch (e: NullPointerException) {
            print("Please enter Integer")
        }*/
    }
}
fun getBirthday(): Int?{
    println("Enter your birthday")
    return readLine()?.toIntOrNull()
}

fun getFortuneCookie(a:Int?): String {
    val listOfFortune: List<String> = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    when(a)
    {
        in 1..10-> return listOfFortune[0]
        in 11..30-> return listOfFortune[1]

    }

    return "Enter valid birthday"
}







