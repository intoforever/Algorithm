import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int cnt = 0;
        
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if (k < num) {
                cnt++;
            }
            
        }
        
        int[] answer = new int[cnt];
        
        for (int i = 0, idx = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if (k < num) {
                answer[idx++] = num;
            }
            
        }
        
        return answer;
    }
}