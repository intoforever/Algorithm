class Solution {
    fun solution(numbers: IntArray): Int {
        val list = numbers.sorted()
        return list[list.lastIndex] * list[list.lastIndex - 1]
    }
}