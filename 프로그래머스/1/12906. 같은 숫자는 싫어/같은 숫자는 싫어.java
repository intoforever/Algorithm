import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for (int a : arr) {
            if (stack.isEmpty() || stack.peek() != a) {
                stack.push(a);
            }
        }
        
        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}