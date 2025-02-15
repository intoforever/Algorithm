import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int gap = Math.abs(array[0] - n);

        Arrays.sort(array);
        
        for (int i = 1; i < array.length; i++) {
            int temp = Math.abs(array[i] - n);
            
            if (gap > temp) {
                gap = temp;
                answer = array[i];
            }
            
            if (gap == temp) {
                answer = answer > array[i] ? array[i] : answer;
            }
        }
        
        return answer;
    }
}