class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        
        for (i in 0..array.size - 1) {
            if (array[i] > height) answer++
        }
        
        return answer
    }
}