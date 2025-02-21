import java.util.*;

class Solution {
    public int solution(String s) {
        int sum = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        Deque<Integer> stack = new ArrayDeque<>();
        
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            
            if(token.equals("Z")){
                if(!stack.isEmpty()){
                    sum -= stack.pollLast();
                }
            } else {
                int num = Integer.parseInt(token);
                stack.offerLast(num);
                sum += num;
            }
        }
        
        return sum;
    }
}