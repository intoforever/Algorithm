class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (; left <= right; left++) {
            int delimiter = getDelimiter(left); // 1 or -1
            
            answer += left * delimiter;
        }        
        
        return answer;
    }
    
    private int getDelimiter(int value) {
        int cnt = 0;
        
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                cnt++;
            }
        }
        
        return cnt % 2 == 0 ? 1 : -1;
    }
}