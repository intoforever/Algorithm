import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            String temp = String.valueOf(myString.charAt(i));
            if(temp.equals("A"))
                sb.append("B");
            else
                sb.append("A");
        }
        
        if(sb.toString().contains(pat))
            answer = 1;
        
        
        return answer;
    }
}