import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[k];
        int min = score[0];
        temp[0] = score[0];
        answer[0] = score[0];
        
        for (int i = 1; i < score.length; i++) {
            int num = score[i];
            
            if (i < k) {
                temp[i] = num;
                
                if (min > num) {
                    min = num;
                }
                
                answer[i] = min;
                
                if (i == k - 1) {
                    Arrays.sort(temp);
                }
                
                continue;
            }
            
            if (temp[0] < num) {
                temp[0] = num;
                Arrays.sort(temp);
                min = temp[0];
            }
            
            answer[i] = min;
        }
        
        return answer;
    }
}