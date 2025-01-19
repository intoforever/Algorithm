import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] flag = new boolean[10];

        for (int n : numbers) {
            flag[n] = true;
        }

        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) answer += i;
        }

        return answer;
    }
}