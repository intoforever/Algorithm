import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        Map<String, Integer> menuMap = new HashMap<>();
        menuMap.put("americano", 4500);
        menuMap.put("cafelatte", 5000);
        menuMap.put("anything", 4500);
        
        for (String o : order) {
            o = o.replaceAll("ice", "");
            o = o.replaceAll("hot", "");
            
            answer += menuMap.getOrDefault(o, 0);
        }
        
        return answer;
    }
}