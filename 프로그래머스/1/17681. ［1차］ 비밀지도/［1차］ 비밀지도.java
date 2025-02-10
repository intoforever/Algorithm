import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        sb.append("%");
        sb.append(n);
        sb.append("s");
        
        for (int i = 0; i < n; i++) {
            String dec = String.format(sb.toString(), Integer.toBinaryString(arr1[i] | arr2[i])).replace(' ', '0');
            dec = dec.replaceAll("0", " ");
            dec = dec.replaceAll("1", "#");
            
            answer[i] = dec;
        }
        
        return answer;
    }
}