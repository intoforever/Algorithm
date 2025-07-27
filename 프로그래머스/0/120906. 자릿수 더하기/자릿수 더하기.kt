class Solution {
    fun solution(n: Int): Int {
        return sum(n)
    }

    fun sum(n: Int) : Int {
        if(n < 10) return n
        return n % 10 + sum(n/10)
    }
}