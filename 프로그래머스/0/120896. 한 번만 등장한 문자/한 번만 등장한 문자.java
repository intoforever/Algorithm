import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(arr);
        
        for (String a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                continue;
            }
            
            sb.append(key);
        }
        
        return sb.toString();
    }
}