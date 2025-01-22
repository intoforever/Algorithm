import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        int len = arr.length;
        
        for (int i = 0; i < len / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        
        return new String(arr);
    }
}