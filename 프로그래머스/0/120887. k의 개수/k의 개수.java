class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for ( ; i <= j; i++) {
            int num = i;
            
            while (num != 0) {
                int remainder = num % 10;
                num /= 10;

                if (remainder == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}