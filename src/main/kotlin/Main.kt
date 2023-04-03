fun main() {

    val nums = mutableListOf(31,14,77,22,44,77,45,56,35,77)
    val evenNums = nums.filter { num -> num%2==0 }
    println(evenNums)
    //2.
    measurements()
    //3
    output()

 //4

    //5.
   var x = Vehicles("KYF020F",966669.00)
    var y = Vehicles("KBM230G",809999.00)
   var z = Vehicles("KCF343P",54000.76)
    var p = Vehicles("KFD343V",9865.54)
    var allVehicles= listOf(x,y,z,p)
  println(vehicleList(allVehicles))
}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun measurements(){
    var height= listOf(170,190,160,166,200)
    println(height.average())
    println( height.sum())
}

//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var long:Double,var weight:Double)
fun output() {
    var persons = Person("Wamboi", 23, 9.8, 70.5)
    var person2 = Person("Gatonye", 14, 4.5, 40.5)
    var person3 = Person("Nyambura", 18, 5.7, 50.7)
    var person4 = Person("Shiro", 25, 6.7, 60.0)
    var allpersons = listOf(persons.age, person2.age, person3.age, person4.age)
    println(allpersons.sortedDescending())
}

//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.


data class Vehicles(var registration:String, var mileage:Double)
fun vehicleList(vehicle:List<Vehicles>):Double{
    var avg=0
    vehicle.forEach { new->new.mileage
        avg + =new.mileage
    }
    var totalAvg=vehicle.count()
    return totalAvg
}