fun main(args: Array<String>) {
    //задание 1
    val age1 = 42
    val age2 = 21

    //задание 2
    val avg1 = (age1 + age2) / 2
    println("Среднее арифметичекое: $avg1")

    //задание 4
    val firstName = "Владислава"
    val lastName =" Горгун"

    //задание 5
    val fullName: String
    fullName = "$firstName" + "$lastName"
    println(fullName)

    //задание 6
    val myDetails: String
    myDetails = "Привет, меня зовут " + "$fullName"
    println(myDetails)

    //задание 7
    val Triple = Triple(9,28,2004)
    val x1 = Triple.first
    val x2 = Triple.second
    val x3 = Triple.third
    println("Дата рождения: ${Triple.first} , ${Triple.second} , ${Triple.third}")

    //задание 8
    val (month, day, year) = Triple
    println("month: $month")
    println("day: $day")
    println("year: $year")

//задание 9

//задание 10

    }
