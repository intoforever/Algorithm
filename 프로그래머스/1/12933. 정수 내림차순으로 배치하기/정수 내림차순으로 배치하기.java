import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strN = String.valueOf(n);
        char[] stringArr = strN.toCharArray();
        
        int len = stringArr.length;
        
        if (len == 1) {
            return n;
        }
        
        for (int i=0; i<len-1; i++) {
            for (int j=0; j<len-1-i; j++) {
                
                if (stringArr[j] < stringArr[j+1]) {
                    char temp = stringArr[j];
                    stringArr[j] = stringArr[j+1];
                    stringArr[j+1] = temp;
                }
                
            }
        }

        String stranswer = new String(stringArr);
        
        answer = Long.parseLong(stranswer);       
        return answer;
    }
}