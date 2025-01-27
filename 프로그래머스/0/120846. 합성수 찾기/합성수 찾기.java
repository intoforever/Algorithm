class Solution {
    public int solution(int n) {
        int answer = n - 1; // 1 제외
        
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            
            if (cnt == 1) {
                answer--;
            }
        }
        return answer;
    }
}