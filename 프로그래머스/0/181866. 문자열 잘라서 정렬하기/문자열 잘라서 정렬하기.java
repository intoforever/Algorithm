import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (String str : strArr) {
            if ("".equals(str)) {
                continue;
            }
            
            list.add(str.replace(" ", ""));
        }
        
        String[] answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer);
        
        return answer;
    }
}