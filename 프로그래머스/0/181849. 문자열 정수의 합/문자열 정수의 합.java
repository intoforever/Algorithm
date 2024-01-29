import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] nums = num_str.toCharArray();
        
        for(char n:nums)
            answer += Character.getNumericValue(n);
        
        return answer;
    }
}