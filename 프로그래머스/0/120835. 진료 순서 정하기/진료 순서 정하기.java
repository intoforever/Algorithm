import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        Emergency[] arr = new Emergency[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = new Emergency(i, emergency[i]);
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < len; i++) {
            answer[arr[i].idx] = i + 1;
        }
        
        return answer;
    }
}

class Emergency implements Comparable<Emergency> {
    int idx;
    int val;
    
    public Emergency(int idx, int val) {
        this.idx = idx;
        this.val = val;
    }
    
    public int compareTo(Emergency other) {
        return other.val - this.val;
    }
}