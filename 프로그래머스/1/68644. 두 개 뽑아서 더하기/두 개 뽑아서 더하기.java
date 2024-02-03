import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        
        Set<Integer> r = new TreeSet<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                r.add(numbers[i]+numbers[j]);        
            }
        }
        
        Integer[] answer = r.toArray(new Integer[r.size()]);
       
        return answer;
    }
}