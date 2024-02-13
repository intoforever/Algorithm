import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list1 = new ArrayList<>();
        for(int a:arr)
            list1.add(a);
        
        for(int d:delete_list)
            list1.remove((Integer) d);
        
        int[] answer = new int[list1.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = list1.get(i);
        
        return answer;
    }
}