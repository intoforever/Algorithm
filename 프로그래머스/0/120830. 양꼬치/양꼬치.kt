class Solution {
    fun solution(n: Int, k: Int): Int {
        val lamb: Int = n * 12000
        val drinks: Int = (k - (n / 10)) * 2000
        return lamb + drinks
    }
}