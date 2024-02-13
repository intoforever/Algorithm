import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<names.length; i++)
            if(i%5 == 0)
                list.add(names[i]);

        int len = list.size();
        String[] answer = new String[len];
        for(int i=0; i<len; i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}