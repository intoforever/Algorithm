import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        Map<String, Character> map = new HashMap<>();
        String[] morse = {
            ".-","-...","-.-.","-.."
            ,".","..-.","--.","...."
            ,"..",".---","-.-",".-.."
            ,"--","-.","---",".--."
            ,"--.-",".-.","...","-"
            ,"..-","...-",".--","-..-"
            ,"-.--","--.."
        };
        
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char) (97 + i));
        }
        
        for (String a : arr) {
            sb.append(map.get(a));
        }
        
        return sb.toString();
    }
}