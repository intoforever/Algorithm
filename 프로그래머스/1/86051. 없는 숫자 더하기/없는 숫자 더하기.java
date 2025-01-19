import java.util.*;

class Solution {
    public int solution(int[] numbers) {        
        int answer = 0;
        int len = numbers.length;
        Integer[] arr = new Integer[len];
        
        Arrays.sort(numbers);
        
        // auto boxing
        for (int i = 0; i < len; i++) {
            arr[i] = numbers[i];
        }
        
        List<Integer> list = Arrays.asList(arr);
        
        for (int i = 0; i < 10; i++) {
            if (list.contains(i)) {
                continue;
            }
            
            answer += i;
        }
        
        return answer;
    }
}