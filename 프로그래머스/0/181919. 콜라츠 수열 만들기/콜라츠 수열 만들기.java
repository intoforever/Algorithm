import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        do {
            list.add(n);
            
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println("n: " + n);
        } while (n != 1);
        
        list.add(1);
        
        return list;
    }
}