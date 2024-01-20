import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1; //마지막에 *= 가능하게 하도록 0이 아니라 1로 설정
        
        /* 의상의 종류별로 몇 개의 의상이 들어있는지 추출 */
        Map<String, Integer> count = new HashMap<>();
        
        for(String[] kinds:clothes){
            if(!count.containsKey(kinds[1])){
                count.put(kinds[1], 1);
                continue;
            }
                count.replace(kinds[1], count.get(kinds[1])+1);
        }
        
        
        /* 의상 종류별 의상 개수+1 한 뒤에 곱해서 저장 */
        Set<String> keys = count.keySet();
        
        for (String key : keys)
            answer *= count.get(key) + 1;
        
        
        /* 다 안입었을 경우만 제외 */
        return answer-1;
    }
}