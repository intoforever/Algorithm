class Solution {
    fun solution(numbers: IntArray): Double {
        if (numbers.size == 0) {
            return 0.0
        }
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum.toDouble() / numbers.size
    }
}