import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int = if (n % sqrt(n.toDouble()).toInt() == 0) 1 else 2
}