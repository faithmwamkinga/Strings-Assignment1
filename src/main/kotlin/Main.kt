fun main(){
courses()
    cities()
    numbers()
println(friendsNames("George", "William", "Levy"))
}
fun courses(){
    var courses = arrayOf("Medicine", "IT", "Journalism", "Education")
    println(courses.contentToString())
}

fun cities() {
    var cities = arrayOf("harare", "mumbai", "dododma", "jakarta")
    for (city in cities){
    println(city.capitalize())
    }

}
//arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1] + numbers[4])
    println(numbers[11])
    println(numbers.sorted())
}


fun friendsNames(name1:String, name2:String, name3:String):String{
    var friendsNames = arrayOf(name1, name2, name3)
    return friendsNames.contentToString()
}