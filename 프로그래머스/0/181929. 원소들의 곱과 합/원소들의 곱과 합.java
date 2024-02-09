class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int sum = 0;
        
        for(int n:num_list){
            multiple *= n;
            sum += n;
        }
        
        sum = sum*sum;
        if(multiple < sum)
            answer = 1;
            
        return answer;
    }
}