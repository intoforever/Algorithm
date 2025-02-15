class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int val = 1;
        
        
        while (true) {
            if (val > n) {
                break;
            }
            
            answer = num++;
            val *= num;
        }
        
        return answer;
    }
}