import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.size() == 0 || stk.peekLast() != arr[i]) {
                stk.offerLast(arr[i]);
                continue;
            }
            stk.pollLast();
            
            if (i == arr.length - 1 && stk.size() == 0) {
                stk.offerLast(-1);
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}