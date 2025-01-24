import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace(" ", "");
            
            if (!"".equals(arr[i])) {
                cnt++;
            }
        }
        
        String[] answer = new String[cnt];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if ("".equals(arr[i])) {
                continue;
            }
            
            answer[idx++] = arr[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}