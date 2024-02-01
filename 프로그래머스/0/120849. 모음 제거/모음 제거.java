// import java.util.*;

class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
        
//         String[] vowels = {"a", "e", "i", "o", "u"};
//         StringBuilder sb = new StringBuilder();
        
//         main:
//         for(int i=0; i<my_string.length(); i++){
//             for(String v:vowels)
//                 if(String.valueOf(my_string.charAt(i)).equals(v)){
//                     sb.append("");
//                     continue main;
//                 }
//             sb.append(String.valueOf(my_string.charAt(i)));
//         }  
        
//         return sb.toString();
    }
}