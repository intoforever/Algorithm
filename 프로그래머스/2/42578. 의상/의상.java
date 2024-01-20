import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;

        Map<String, Integer> count = new HashMap<>();
        
        for(String[] kinds:clothes){
            if(!count.containsKey(kinds[1])){
                count.put(kinds[1], 1);
                continue;
            }
                count.replace(kinds[1], count.get(kinds[1])+1);
        }
        
        Set<String> keys = count.keySet();
        int isFirstOne = 0;
        
        for (String key : keys) {
            if(isFirstOne == 0){
                answer = count.get(key) + 1;
                isFirstOne = 1;
                continue;
            }
            answer *= count.get(key) + 1;
        }
        
        return answer-1;
    }
}