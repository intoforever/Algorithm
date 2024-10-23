import java.util.*;

class Solution {
    public int solution(int[] nums) {       
        int answer = 0;
        int numsLen = nums.length;
        int monstersLen;
        Set<Integer> monsters = new HashSet<>();
        
        for (int i=0; i < numsLen; i++) {
            monsters.add(nums[i]);
        }
        monstersLen = monsters.size();
        
        if (numsLen/2 >= monstersLen) {
            answer = monstersLen;    
        } else {
            answer = numsLen/2;
        }
        
        return answer;
    }
}