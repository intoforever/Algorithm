import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        
        Set<Integer> r = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i!=j)  r.add(numbers[i]+numbers[j]);        
            }
        }
        
        Integer[] answer = r.toArray(new Integer[r.size()]);
       
        return answer;
    }
}