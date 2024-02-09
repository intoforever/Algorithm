class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int plus = 0;
        
        for(int n:num_list){
            multiple *= n;
            plus += n;
            System.out.println(multiple);
            System.out.println(plus);
        }
        
        if(multiple < plus*plus)
            answer = 1;
            
        return answer;
    }
}