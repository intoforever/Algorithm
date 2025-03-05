import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < arr.length;) {
            int a = arr[i];
            if (stk.size() != 0 && stk.peekLast() >= a) {
                stk.pollLast();
            } else {
                i++;
                stk.offer(a);
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}