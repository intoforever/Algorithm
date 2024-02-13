class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<answer.length-n; i++){
            answer[i] = num_list[n+i];
        }
        
        for(int i=0; i<n; i++){
            answer[answer.length-n+i] = num_list[i];
            System.out.println(answer[answer.length-n]);
        }
        
        return answer;
    }
}