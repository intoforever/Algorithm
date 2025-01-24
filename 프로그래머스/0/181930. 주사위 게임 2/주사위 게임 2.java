class Solution {
    public int solution(int a, int b, int c) {        
        int sum1 = a + b + c;
        int sum2 = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2);
        int sum3 = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3);
        
        if (a == b && b == c) {
            return sum1 * sum2 * sum3;
        } else if (a == b || b == c || a == c) {
            return sum1 * sum2;
        } else {
            return sum1;
        }
    }
}