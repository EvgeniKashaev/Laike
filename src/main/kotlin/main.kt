package ru.netology

fun main() {
    val likes = 222
    var peoplehuman = "людям!"

    if(likes == 0){
       peoplehuman = "людей!"
    } else if (likes%10 == 1 && likes%100 != 11){
        peoplehuman = "человеку!"
    }
    println("Понравилось $likes $peoplehuman")
}