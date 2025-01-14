import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] array = my_string.split("");
        List<Integer> list = new ArrayList<>();
        
        for (String a : array) {
            if (!checkIsNumber(a)) {
                continue;
            }
            
            list.add(Integer.parseInt(a));
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
    
    private boolean checkIsNumber(String s) {
        boolean isNumber = false;
        
        try {
            Integer.parseInt(s);
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }
        
        return isNumber;
    }
}