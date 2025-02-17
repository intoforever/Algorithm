import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[30];
        
        for (String s : strArr) {
            arr[s.length() - 1]++;
        }
        
        Arrays.sort(arr);
        
        return arr[arr.length - 1];
    }
}