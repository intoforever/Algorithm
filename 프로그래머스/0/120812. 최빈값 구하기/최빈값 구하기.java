import java.util.*;

class Solution {
    public int solution(int[] array) {
        // K, V 초기화
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        // 최빈값 V 확인
        int max = -1;
        for (int n : map.values()) {
            max = Math.max(max, n);
        }

        // K 확인
        int count = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                count++;
                result = entry.getKey();
            }
        }
        return count == 1 ? result : -1;
    }
}