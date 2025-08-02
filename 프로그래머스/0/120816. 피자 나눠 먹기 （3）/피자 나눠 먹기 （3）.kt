class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer = 1
        var flag = true
        
        while (flag) {
            if ((slice * answer) / n >= 1) {
                flag = false
                break
            }
            answer++
        }
        
        return answer
    }
}