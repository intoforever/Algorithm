class Solution {
    fun solution(n: Int): Int = (1..n).filter{num -> num % 2 == 0}.sum()
}