import java.util.*;

class Solution {
    public String solution(String s) {
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        
        return sb.toString();
    }
}