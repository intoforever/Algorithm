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
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modes.add(entry.getKey());
            }
        }
        return modes.size() == 1 ? modes.get(0) : -1;
    }
}