import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i].replace(" ", "");
            
            if (!"".equals(arr[i])) {
                list.add(str);
            }
        }
        
        String[] answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer);
        
        return answer;
    }
}