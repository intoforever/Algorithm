import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            int target = indices[i];
            
            str[target] = "";
        }
        
        
        return String.join("", str);
    }
}