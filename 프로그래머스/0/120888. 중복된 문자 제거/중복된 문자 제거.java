import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Boolean> map = new HashMap<>();
        
        for (char c : my_string.toCharArray()) {
            if (map.containsKey(c)) {
                continue;
            }
            
            map.put(c, true);
            sb.append(c);
        }
        
        return sb.toString();
    }
}