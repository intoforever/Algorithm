import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if (m > score.length) {
            return answer;
        }
        
        int leftOver = score.length % m;
        Map<Integer, Integer> map = new HashMap<>();
        
        Arrays.sort(score);
        
        for (int i = leftOver, min = score[leftOver]; i <= score.length; i++) {
            if (i == score.length) {
                map.put(min, map.getOrDefault(min, 0) + 1);
                break;
            }
            
            if (i != leftOver && (i - leftOver) % m == 0) {
                map.put(min, map.getOrDefault(min, 0) + 1);
                min = score[i];
            }
            
            min = Math.min(min, score[i]);
        }
        
        for (Integer key : map.keySet()) {
            answer += key * m * map.get(key);
        }
        
        return answer;
    }
}