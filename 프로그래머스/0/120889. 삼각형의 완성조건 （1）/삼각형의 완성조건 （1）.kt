class Solution {
    fun solution(sides: IntArray): Int {
        val sortedSides = sides.sortedArrayDescending()
        return if (sortedSides[0] < sortedSides[1] + sortedSides[2]) {
            1
        } else {
            2
        }
    }
}