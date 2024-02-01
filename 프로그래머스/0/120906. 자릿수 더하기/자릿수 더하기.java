import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String stringN = String.valueOf(n);
        String[] stringArr = stringN.split("");
        List<Integer> intList = new ArrayList<>();
        
        for(String s:stringArr){
            intList.add(Integer.parseInt(s));
        }
        
        for(int i=0; i<intList.size(); i++)
            answer += intList.get(i);

        return answer;
    }
}