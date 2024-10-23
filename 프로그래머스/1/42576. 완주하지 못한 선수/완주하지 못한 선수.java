import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            map.merge(p, 1, Integer::sum);
        }
        
        for (String c : completion) {
            map.compute(c, (k, v) -> c.equals(k) ? v - 1 : v);
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