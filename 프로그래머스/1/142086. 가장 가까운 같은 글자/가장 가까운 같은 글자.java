import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = i - map.getOrDefault(arr[i], i + 1);
            map.put(arr[i], i);
        }
        
        return answer;
    }
}