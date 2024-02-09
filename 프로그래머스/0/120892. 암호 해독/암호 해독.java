import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] arr = cipher.split("");
        
        for(int i=1; i<=arr.length; i++)
            if(i%code == 0)
                sb.append(arr[i-1]);
        
        return sb.toString();
    }
}