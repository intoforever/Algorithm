import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < flag.length; i++) {
            int num = arr[i];
            
            if (flag[i]) {
                for (int j = 0; j < num * 2; j++) {
                    stack.push(num);
                }
            } else {
                for (int j = 0; j < num; j++) {
                    stack.pop();
                }
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}