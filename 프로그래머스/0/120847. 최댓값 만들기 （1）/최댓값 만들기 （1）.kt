class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        val maxIdx = numbers.size - 1
        return numbers[maxIdx] * numbers[maxIdx - 1]
    }
}