import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        val root = sqrt(n.toDouble()).toInt()
        return if (root * root == n) 1 else 2
    }
}