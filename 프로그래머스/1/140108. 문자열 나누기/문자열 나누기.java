import java.util.*;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int answer = 0, same = 0, diff = 0, first = 0, left = arr.length;
        for (char c : arr) {
            if (first == 0) {
                first = c;
                same++;
            } else if (first == c) {
                same++;
            } else {
                diff++;
            }

            if (same == diff) {
                answer++;
                first = 0;
                left -= (same + diff);
                same = 0;
                diff = 0;
            }
        }
        
        if (left > 0) {
            answer++;
        }
        
        return answer;
    }
}