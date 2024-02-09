import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        String[] arr = rsp.split("");
        String answer = "";
        
        String scissors = "2";
        String rock = "0";
        String paper = "5";
        
        for(String a:arr)
            if(a.equals(scissors))
                sb.append(rock);
            else if(a.equals(rock))
                sb.append(paper);
            else
                sb.append(scissors);
        
        answer = sb.toString();
        return answer;
    }
}