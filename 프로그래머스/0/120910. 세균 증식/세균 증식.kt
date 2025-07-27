import kotlin.math.pow

class Solution {
    fun solution(n: Int, t: Int) = n * 2.pow(t)
}

fun Int.pow(t: Int): Int {
    return this.toDouble().pow(t.toDouble()).toInt()
}