import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = Arrays.copyOf(emergency, len);
        Arrays.sort(temp);
        
        for (int i = len - 1, score = 1; i >= 0; i--, score++) {
            map.put(temp[i], score);
        }
        
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            int key = emergency[i];
            answer[i] = map.get(key);
        }
        
        return answer;
    }
}