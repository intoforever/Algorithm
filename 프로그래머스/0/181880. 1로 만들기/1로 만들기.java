class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int num : num_list) {
            answer += countCases(num);
        }
        
        return answer;
    }
    
    public int countCases (int num) {
        int cnt = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num - 1) / 2;
            }
            
            cnt++;
        }
        
        return cnt;
    }
}