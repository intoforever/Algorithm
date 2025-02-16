import java.util.*;

class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        for (int a : array) {
            sb.append(a);
        }
        
        String str = sb.toString();
        str = str.replaceAll("[0-68-9]", "");
        
        return str.length();
    }
}