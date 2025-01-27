class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = n;
        int power = 1;
        
        while (m > 0) {
            m /= 3;
            
            if (m > 0) {
                power *= 3;
            }
        }
        
        while (n > 0) {
            int remainder = n % 3;
            answer += remainder * power;
            power /= 3;
            n /= 3;
        }
        
        return answer;
    }
}
