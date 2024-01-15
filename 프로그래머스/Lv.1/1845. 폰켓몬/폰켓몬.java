import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> myPkm = new ArrayList<>();
        
        for(int n:nums){
            if(!myPkm.contains(n)){
                    myPkm.add(n);
                    continue;
                }
            }
        
        
        if(myPkm.size() > nums.length/2)
            answer = nums.length/2;
        else
            answer = myPkm.size();
        return answer;
    }
}