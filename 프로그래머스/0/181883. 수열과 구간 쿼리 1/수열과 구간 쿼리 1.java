import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        
        for (int i = 0; i < queries.length; i++) {
            processQuery(map, queries[i]);
        }
        
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(i);
        }
        
        return answer;
    }
    
    private void processQuery(Map<Integer, Integer> map, int[] query) {
        int s = query[0];
        int e = query[1];
        
        for (int i = s; i <= e; i++) {
            map.put(i, map.get(i) + 1);
        }
    }
}