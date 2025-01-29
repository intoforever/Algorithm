import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                answer[i] = i - map.get(arr[i]);
                map.put(arr[i], i);
                
                continue;
            }
            
            map.put(arr[i], i);
            answer[i] = -1;
        }
        
        return answer;
    }
}