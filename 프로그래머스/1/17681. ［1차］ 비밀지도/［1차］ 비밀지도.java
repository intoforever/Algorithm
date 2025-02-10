import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            int enc1 = arr1[i];
            int enc2 = arr2[i];
            
            for (int j = 0; j < n; j++) {
                String dec = "#";
                
                if (enc1 % 2 == 0 && enc2 % 2 == 0) {
                    dec = " ";
                }
                
                enc1 /= 2;
                enc2 /= 2;
                
                stack.push(dec);
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int k = 0; k < n; k++) {
                sb.append(stack.pop());
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}