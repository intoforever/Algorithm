import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        Map<String, Integer> menuMap = new HashMap<>();
        menuMap.put("americano", 4500);
        menuMap.put("cafelatte", 5000);
        
        for (String o : order) {
            o = o.replace("ice", "");
            o = o.replace("hot", "");
            
            if ("anything".equals(o)) {
                o = "americano";
            }
            
            answer += menuMap.getOrDefault(o, 0);
        }
        
        return answer;
    }
}