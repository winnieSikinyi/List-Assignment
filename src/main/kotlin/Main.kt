fun main() {

    val nums = mutableListOf(31,14,77,22,44,77,45,56,35,77)
    val evenNums = nums.filter { num -> num%2==0 }
    println(evenNums)

    //3.
    measurements()
}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height


//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
fun measurements(){
    var height= listOf(170,190,160,166,200)
    println(height.average())
    println( height.sum())
    }
//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun car(): Double{
    var things = mutableListOf("KDA 122E 5555.44","KZE 123D 2278.74,34251.46")

}