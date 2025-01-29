import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        boolean[] boolArr = new boolean[s.length()];
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                boolArr[i] = true;
                continue;
            }
            
            map.put(arr[i], i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            int idx;
            
            if (!boolArr[i]) {
                idx = -1;
            } else {
                Integer val = map.get(arr[i]);
                idx = (val != null) ? i - val : -1;
                map.put(arr[i], i);
            }
            
            answer[i] = idx;
        }
        
        return answer;
    }
}