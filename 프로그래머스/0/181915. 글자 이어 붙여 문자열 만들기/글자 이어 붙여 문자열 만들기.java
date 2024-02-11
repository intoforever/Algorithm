import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] s = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i:index_list)
            sb.append(s[i]);
        
        return sb.toString();
    }
}