import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0, cntX = 0, cntY = 0;
        String[] arr = s.split("");
        
        for (int i = 0; i < arr.length; i++) {
            String x = arr[0];
            if (x.equals(arr[i])) {
                cntX++;
            } else {
                cntY++;
            }

            if (cntX == cntY) {
                arr = Arrays.copyOfRange(arr, i + 1, arr.length);
                i = -1;
                answer++;
            }
        }
        
        if (arr.length > 0) {
            answer++;
        }
        
        return answer;
    }
}