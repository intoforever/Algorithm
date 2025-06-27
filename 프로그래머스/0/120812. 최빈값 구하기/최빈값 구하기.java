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
        int answer = -1;
        for (int key : map.keySet()) {
            if (answer != -1 && map.get(key) == max) {
                answer = -1;
                break;
            }
            if (map.get(key) == max) {
                answer = key;
            }
        }
        
        return answer;
    }
}