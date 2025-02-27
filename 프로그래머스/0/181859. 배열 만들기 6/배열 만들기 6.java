import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int a : arr) {
            if (stk.size() == 0 || stk.peek() != a) {
                stk.push(a);
                continue;
            }
            stk.pop();
        }
        
        if (stk.size() == 0) {
            stk.push(-1);
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}