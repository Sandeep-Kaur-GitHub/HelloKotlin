package Aquarium

import java.lang.reflect.Array.get
import java.lang.reflect.Array.set
/*
Create a new class, Spice.
Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
Add an init block that prints out the values for the object after it has been created. Create a spice.
Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
Because salt is a very common spice, create a helper function called makeSalt().*/
class Aquarium(name: String, spiceness: String="mild"){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    var spice=spiceness
    val heat: Int
        get()
        {
            return when(spice){
            "mild"-> return 5
                "sour"-> return 9
                "cold"-> return 8
            else -> return 0 }
        }
  init {
      print("$name and $spiceness")
  }
}
































/*    var name: String="curry"
    var spiceness: String="mild"
    val heat: Int
    get() {return when(spiceness){
        "mild"-> return 5
        else -> {return 0}
    }
    }*/
