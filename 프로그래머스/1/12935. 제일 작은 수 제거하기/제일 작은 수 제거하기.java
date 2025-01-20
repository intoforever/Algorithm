import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        if (len == 1) {
            return new int[]{-1};
        }
        
        int[] answer = new int[len - 1];
        int min = getMinValue(arr);
        
        for (int i = 0, idx = 0; i < len; i++) {
            if (arr[i] == min) {
                continue;
            }
            
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
    
    /*
    * 최소값 구하는 함수
    */
    private int getMinValue(int[] arr) {
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        return min;
    }
}