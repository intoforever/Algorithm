import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, (p1, p2) -> p2.length() - p1.length());
        Map<String, Integer> map = new HashMap<>();
        
        for (String phone : phone_book) {
            map.put(phone, 0);
        }
        
        for (String phone : phone_book){
            for (int i = 0; i < phone.length(); i++) {
                if(map.containsKey(phone.substring(0, i))){ // 긴거 기준으로 생각
                    return false;
                }   
            }
        }
        
        return true;
    }
}