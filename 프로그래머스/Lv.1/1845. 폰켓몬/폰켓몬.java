class Solution {
    public int solution(int[] nums) {
		int size = nums.length;
		int max = 0;
		int answer = 0;
		
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(nums[i] == nums[i+j+1])
					nums[i+j+1] = 0;
			}//for j ends
		}//for i ends
		
		for(int i=0; i<size; i++)
			if(nums[i] != 0)
				max++;
		
		if(size/2 < max)
			answer = size/2;
		else if(size/2 == max)
			answer = max;
		else
			answer = max;
        return answer;
    }
}