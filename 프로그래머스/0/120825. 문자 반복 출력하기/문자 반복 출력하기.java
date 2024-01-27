import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        
        for(char c:chars){
            for(int i=0; i<n; i++)
                answer += c;
        }
        
        
        return answer;
    }
}