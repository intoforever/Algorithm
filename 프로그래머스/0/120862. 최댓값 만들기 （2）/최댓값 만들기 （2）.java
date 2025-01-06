import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 배열 정렬
        Arrays.sort(numbers); // 오름차순 정렬

        // 양수 최대값 두 개 곱
        int len = numbers.length;
        int posMaxVal = numbers[len - 1] * numbers[len - 2]; // 가장 큰 두 수 곱

        // 음수 최소값 두 개 곱 (절대값이 가장 큰 음수일수록 곱이 큼)
        int negMaxVal = numbers[0] * numbers[1]; // 가장 작은 두 수 곱

        // 두 값 중 최대값 반환
        return Math.max(posMaxVal, negMaxVal);
    }
}
