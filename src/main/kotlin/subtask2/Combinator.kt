package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        var n = array[1]
        var combinations = 1
        for(x in 1..n) {
            combinations = combinations * n / x
            if( m == combinations ) {
                return x
            }
            n -= 1
        }
        return null
    }
}
