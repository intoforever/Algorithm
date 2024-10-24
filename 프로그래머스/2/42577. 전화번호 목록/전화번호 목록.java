import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String num : phone_book){
            if (!map.containsKey(num)){
                map.put(num, 0);
            } else{
                return false;
            }
        }

        for (String phone : phone_book){
            for (int i = 0 ; i < phone.length() ; i++){
                if(map.containsKey(phone.substring(0, i))){
                    return false;
                }
            }
        }


        return true;
    }
}