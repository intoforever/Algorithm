import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        
        for(char a:arr){
            if(Character.isUpperCase(a))
                sb.append(String.valueOf(a).toLowerCase());
            else
                sb.append(String.valueOf(a).toUpperCase());
        }
        
        String answer = sb.toString();
        return answer;
    }
}