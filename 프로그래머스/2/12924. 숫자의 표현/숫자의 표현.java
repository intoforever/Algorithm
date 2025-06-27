class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 연속된 k개 자연수의 합: k*start + k*(k-1)/2 = n
        // start = (n - k*(k-1)/2) / k
        for (int k = 1; k <= n; k++) {
            int numerator = n - k * (k - 1) / 2;
            if (numerator <= 0) {
                break;
            }
            if (numerator % k == 0) {
                count++;
            }
        }
        
        return count;
    }

}