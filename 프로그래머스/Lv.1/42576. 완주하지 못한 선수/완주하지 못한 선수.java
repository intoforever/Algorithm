import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String,Integer> finishers = new HashMap<>();
        
        /*
        * < for1 >
        * Map에 데이터 넣기
        *
        * 완주자 명단에 동명이인이 있을 경우 (동일한 key가 2개 이상)
        * value++;
        */
        
        for(String f:completion){
            if(!finishers.containsKey(f)){
                finishers.put(f, 1);
            }
            else {
                finishers.replace(f, finishers.get(f)+1);
            }
        }//for1 ends
        
        
        for(String r:participant){
            if(!finishers.containsKey(r)){
                answer = r;
                break;
            }
            else if(finishers.containsKey(r) && finishers.get(r) != 0){
                finishers.replace(r, finishers.get(r)-1);
            }
            else{
                answer = r;
                break;
            }
            
        }//for2 ends

        return answer;
    }
}