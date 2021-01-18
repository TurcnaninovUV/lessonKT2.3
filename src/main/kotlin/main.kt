fun main() {
    var likes = 534
    if (likes % 10 == 1 && likes % 100 != 11 && likes != 11)
        println("Понравилось $likes человеку")
    else if (likes == 1)
        println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}
