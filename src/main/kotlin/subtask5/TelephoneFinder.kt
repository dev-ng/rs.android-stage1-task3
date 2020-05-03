package subtask5

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val keyboard = mapOf(
            '0' to arrayOf("8"),
            '1' to arrayOf("2","4"),
            '2' to arrayOf("1","3","5"),
            '3' to arrayOf("2","6"),
            '4' to arrayOf("1","5","7"),
            '5' to arrayOf("2","4","6","8"),
            '6' to arrayOf("3","5","9"),
            '7' to arrayOf("4","8"),
            '8' to arrayOf("5","7","9","0"),
            '9' to arrayOf("6","8")
        )

        val len = number.length
        var result: Array<String> = arrayOf()
        for(i in 0..(len-1)) {
            val toReplace = number[i]
            if(! keyboard.containsKey(toReplace)) {
                return null
            }
            val left = number.substring(0, i)
            val right = number.substring(i + 1, len)
            for(v in keyboard[toReplace]!!) {
                result = result + (left + v + right)
            }
        }
        return result
    }
}
