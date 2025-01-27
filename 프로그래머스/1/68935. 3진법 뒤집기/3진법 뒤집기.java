import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        while (n != 0) {
            int value = n % 3;
            queue.offer(value);
            n /= 3;
        }

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            answer *= 3;
            answer += pop;
        }

        return answer;
    }

}