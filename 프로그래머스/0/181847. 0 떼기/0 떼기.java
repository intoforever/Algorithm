import java.util.*;

class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstNotZero = false;
        
        for(String n:n_str.split("")){
            if(!n.equals("0")){
                isFirstNotZero = true;
            }
            
            if(isFirstNotZero)
                sb.append(n);
        }
        
        String answer = sb.toString();
        return answer;
    }
}