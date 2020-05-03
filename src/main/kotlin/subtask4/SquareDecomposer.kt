package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val square = number * number
        val result = decomposeValue(square, number - 1)
        return result
    }

    private fun decomposeValue(value: Int, start: Int): Array<Int>? {
        for( i in start downTo 1 ) {
            val square = i * i
            val reminder = value - square
            if(0 == reminder) {
                return arrayOf(i)
            }

            if(0 > reminder ) {
                return null
            }

            var sqrt = Math.floor( Math.sqrt(reminder.toDouble()) ).toInt()
            if(sqrt >= i) {
                sqrt = i - 1
            }
            val decomposed = decomposeValue(reminder, sqrt)
            if(null != decomposed) {
                return decomposed + arrayOf(i)
            }
        }
        return null
    }
}