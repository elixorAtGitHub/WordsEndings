const val WORD_LYUDI = "людям"
const val WORD_CHELOVEK = "человеку"

fun main() {
    val likes = 121
    print("Понравилось $likes ")
    println(endOfWord(likes))
}

fun endOfWord(likes: Int): String {if (likes % 10 == 1 && likes % 100 != 11) return WORD_CHELOVEK else return WORD_LYUDI}