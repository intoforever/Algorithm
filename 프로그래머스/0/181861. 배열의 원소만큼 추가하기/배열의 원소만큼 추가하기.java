import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int a:arr)
            for(int i=0; i<a; i++)
                list.add(a);
        
        
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
}