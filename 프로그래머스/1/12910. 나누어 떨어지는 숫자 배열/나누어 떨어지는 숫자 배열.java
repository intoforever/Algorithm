import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor != 0) {
                continue;
            }
            
            cnt++;
            list.add(a);
        }
        
        int[] answer = {-1};
        
        if (cnt != 0) {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}