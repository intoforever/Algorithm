class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int cnt = countDividers(i);
            answer += cnt > limit ? power : cnt;
        }
        
        return answer;
    }
    
    private int countDividers(int n) {
        int cnt = 0;
        int sqrtN = (int) Math.sqrt(n);
        
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    cnt++; // i와 n/i가 같은 경우 (즉, n이 완전제곱수)
                } else {
                    cnt += 2;
                }
            }
        }
        
        return cnt;
    }
}