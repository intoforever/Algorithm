import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];
        int idx = 0;
        
        for (int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        
        for (int a : arr) {
            if (idx == k) {
                break;
            }
            
            if (map.containsKey(a)) {
                continue;
            }
            
            map.put(a, 0);
            answer[idx++] = a;
        }
        
        return answer;
    }
}