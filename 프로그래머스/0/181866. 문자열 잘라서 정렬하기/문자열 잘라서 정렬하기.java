import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : myString.split("")) {
            if (" ".equals(s)) {
                continue;
            }
            
            sb.append(s);
        }
        
        String[] strArr = sb.toString().split("x");
        List<String> list = new ArrayList<>();
        
        for (String str : strArr) {
            if ("".equals(str)) {
                continue;
            }
            
            list.add(str);
        }
        
        String[] answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer);
        
        return answer;
    }
}