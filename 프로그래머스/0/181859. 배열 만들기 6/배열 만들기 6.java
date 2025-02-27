import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int a : arr) {
            if (stk.size() == 0) {
                stk.push(a);
            } else if (stk.peek() == a) {
                stk.pop();
            } else {
                stk.push(a);
            }
        }
        
        if (stk.size() == 0) {
            stk.push(-1);
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}