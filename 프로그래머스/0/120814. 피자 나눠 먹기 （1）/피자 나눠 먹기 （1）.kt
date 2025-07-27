class Solution {
    fun solution(n: Int) = n / 7 + if (n % 7 > 0) 1 else 0
}