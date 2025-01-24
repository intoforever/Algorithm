import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] split = myString.split("x");
        ArrayList <String> al = new ArrayList <> ();

        for(int i = 0; i < split.length; i ++){
            if(!split[i].equals("")){
                al.add(split[i]);
            }

        }

        answer = new String [al.size()];
        for(int i = 0; i < al.size(); i ++){
            answer[i] = al.get(i);
        }
        Arrays.sort(answer);


        return answer;
    }
}