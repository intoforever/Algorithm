import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        int beforeIdx = 0;
        int afterIdx = 0;
        for(int i=0; i<myString.length(); i++)
            if(String.valueOf(myString.charAt(i)).equals("x")){
                afterIdx = i;
                list.add(afterIdx-beforeIdx);
                beforeIdx = i+1;
            }
        
        list.add(myString.length()-beforeIdx);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}