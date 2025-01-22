import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        
        for (char a : arr) {
            sb.append(a);
        }
        
        return sb.toString();
    }
}