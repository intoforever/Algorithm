import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> q = new LinkedList<>();
        int target = 0;
        
        for (int n : numbers) {
            q.add(n);
        }
        
        if ("right".equals(direction)) {
            target = q.pollLast();
            q.offerFirst(target);
        } else {
            target = q.pollFirst();
            q.offerLast(target);
        }
        
        return q.stream().mapToInt(Integer::intValue).toArray();
    }
}