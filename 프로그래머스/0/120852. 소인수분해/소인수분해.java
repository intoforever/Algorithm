import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new LinkedList<>();
        
        for (int i = 2; i <= n; i++) {
            boolean flag = false;
            
            while (n % i == 0) {
                if (flag == false) {
                    flag = true;
                    list.add(i);
                }
                n /= i;
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}