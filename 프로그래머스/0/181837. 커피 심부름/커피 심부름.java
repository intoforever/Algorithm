import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String o : order) {
            int val = 5000;
            
            if (o.contains("americano") || "anything".equals(o)) {
                val = 4500;
            }
            
            answer += val;
        }
        
        return answer;
    }
}