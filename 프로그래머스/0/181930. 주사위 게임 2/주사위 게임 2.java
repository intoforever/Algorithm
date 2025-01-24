class Solution {
    public int solution(int a, int b, int c) {        
        int sum1 = a + b + c;
        
        if (a == b && b == c) {
            return sum1 * pow(a, b, c, 2) * pow(a, b, c, 3);
        } else if (a == b || b == c || a == c) {
            return sum1 * pow(a, b, c, 2);
        } else {
            return sum1;
        }
    }
    
    private int pow(int a, int b, int c, int cnt) {
        return (int) Math.pow(a, cnt) + (int) Math.pow(b, cnt) + (int) Math.pow(c, cnt);
    }
}