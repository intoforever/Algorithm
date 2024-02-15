import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            char c = myString.charAt(i);
            
            if(c<'l')
                sb.append(String.valueOf('l'));
            else
                sb.append(String.valueOf(c));
            
        }
        
        String answer = sb.toString();
        return answer;
    }
}