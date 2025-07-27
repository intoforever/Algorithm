import kotlin.math.pow

class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer = n
        
        for (i in 1..t) {
            answer *= 2
        }
        
        return answer
    }
}