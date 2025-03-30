class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if (M == 1 && N == 1) {
            return answer;
        }
        
        int bigger = Math.max(M, N);
        int shorter = Math.min(M, N);
        
        answer = shorter - 1;
        for (int i = 0; i < shorter; i++) {
            answer += bigger - 1;
        }
        
        return answer;
    }
}