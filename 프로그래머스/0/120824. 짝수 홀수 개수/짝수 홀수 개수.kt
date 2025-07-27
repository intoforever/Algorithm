class Solution {
    fun solution(num_list: IntArray): IntArray {
        var odd: Int = 0
        var even: Int = 0
        
        for (i in 0..num_list.size - 1) {
            val num = num_list[i]
            if (num % 2 == 0) {
                even++
            } else {
                odd++
            }
        }
        
        return intArrayOf(even, odd)
    }
}