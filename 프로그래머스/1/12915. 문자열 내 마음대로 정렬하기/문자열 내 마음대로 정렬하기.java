import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].charAt(n));
            sb.append(strings[i]);
            answer[i] = sb.toString();
            
            sb.setLength(0);
        }
        
        Arrays.sort(answer);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }
        
        return answer;
    }
}