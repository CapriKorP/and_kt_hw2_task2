fun main() {
    val likes = 111
    if ((likes - 1) % 10 === 0 && (likes - 11) % 100 !== 0) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}

