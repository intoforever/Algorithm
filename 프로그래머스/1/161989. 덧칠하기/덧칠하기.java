import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int s : section) {
            q.offer(s);
        }
        
        while (null != q.peek()) {
            answer++;
            Integer poll = q.poll();
            Integer peek = q.peek();
            
            if (null == peek) {
                break;
            }
            
            if (m == 1) {
                continue;
            }
            
            int rollerEnd = (poll - 1) + m;
            
            if (rollerEnd >= peek) {
                while (null != peek && rollerEnd >= peek) {
                    q.poll();
                    peek = q.peek();
                }
            }
        }
        
        return answer;
    }
}