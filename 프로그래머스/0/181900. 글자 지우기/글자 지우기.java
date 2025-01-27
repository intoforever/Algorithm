import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            int target = indices[i];
            
            str[target] = "";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        
        return sb.toString();
    }
}