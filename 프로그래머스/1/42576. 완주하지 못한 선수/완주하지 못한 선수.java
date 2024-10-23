import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        Set<String> keys = map.keySet();
        
        for (String k : keys) {
            if (map.get(k) == 0) {
                continue;
            }
            answer = k;
        } 
        return answer;
    }
}