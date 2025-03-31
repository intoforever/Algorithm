import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int[] aDivisor = getDivisor(a);
        
        for (int val : aDivisor) {
            if (b % val == 0) {
                b /= val;
            }
        }
        
        while (b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) {
                b /= 2;
            }
            if (b % 5 == 0) {
                b /= 5;
            }
        }
        
        if (b == 1) {
            answer = 1;
        }
        
        return answer;
    }
    
    public int[] getDivisor(int a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= a; i++) {
            if (a % i != 0) {
                continue;
            }
            set.add(i);
            while (a % i == 0) {
                a /= i;
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}