import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for (int a : arr) {
            // 첫번째 값 저장
            if (stack.isEmpty()) {
                stack.push(a);
                continue;
            }
            
            int value = stack.peek();
            
            if (a != value) {
                stack.push(a);
            }
        }
        
        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}