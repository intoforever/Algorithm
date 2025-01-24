import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len1 = intervals[0][1] - intervals[0][0] + 1;
        int len2 = intervals[1][1] - intervals[1][0] + 1;
        
        int[] intervals1 = new int[len1];
        int[] intervals2 = new int[len2];
        
        for (int i = 0, idx = intervals[0][0]; i < len1; i++) {
            intervals1[i] = arr[idx++];
        }
        
        for (int i = 0, idx = intervals[1][0]; i < len2; i++) {
            intervals2[i] = arr[idx++];
        }
        
        int[] answer = new int[intervals1.length + intervals2.length];
        System.arraycopy(intervals1, 0, answer, 0, intervals1.length);
        System.arraycopy(intervals2, 0, answer, intervals1.length, intervals2.length);
        
        return answer;
    }
}