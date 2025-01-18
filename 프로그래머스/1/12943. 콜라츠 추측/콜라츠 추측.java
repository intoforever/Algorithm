class Solution {
    public int solution(int num) {
        long num2 = num;
        
        for (int i = 0; i < 500; i++) {
            if (num2 == 1) {
                return i;
            }
            
            if (num2 % 2 == 0) {
                num2 /= 2;
            } else {
                num2 = num2 * 3 + 1;
            }
        }
            
        return -1;
    }
}