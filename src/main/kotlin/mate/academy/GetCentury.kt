package mate.academy

const val CENTURY = 100
const val PLUS_YEAR = 1
const val MINES_YEAR = -1
fun getCentury(year: Int): Int {
    return (year - MINES_YEAR) / CENTURY + PLUS_YEAR
}
