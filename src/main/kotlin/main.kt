fun main() {
    var likes = 121
    if (likes % 10 == 1 && likes != 11)
        println("Понравилось $likes человеку")
    else if (likes == 1)
        println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}
