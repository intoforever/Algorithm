import java.util.*;

class Solution {
    public int[] solution(int n) {
        int nums = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nums++;
            }
        }
        
        int[] answer = new int[nums];
        nums = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[nums++] = i;
            }
        }
        
        return answer;
    }
}