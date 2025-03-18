import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }
        
        Arrays.sort(rank);
        int delimiter = 10000;
        int idx;
        
        for (int i = 0; i < rank.length; i++) {
            idx = map.get(rank[i]);
            if (attendance[idx]) {
                answer += idx * delimiter;
                delimiter /= 100;
            }
        }
        
        return answer;
    }
}