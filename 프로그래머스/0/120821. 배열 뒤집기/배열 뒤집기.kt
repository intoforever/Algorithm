class Solution {
    fun solution(num_list: IntArray): IntArray {
        val answer: IntArray = IntArray(num_list.size);
        for (i in 0..num_list.size - 1) {
           answer[i] = num_list[num_list.size - 1 - i] 
        }
        return answer
    }
}