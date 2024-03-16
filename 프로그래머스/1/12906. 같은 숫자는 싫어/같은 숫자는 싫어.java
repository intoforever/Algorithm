import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 리스트 생성
        List<Integer> list = new ArrayList<>();
        
        // 기준점
        int prev = arr[0];
        list.add(prev);
        
        // 돌면서 비교
        for(int i=1; i<arr.length; i++){
            int next = arr[i];
           if(prev == next) {
               continue;
           }
            list.add(next);
            prev = next;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}