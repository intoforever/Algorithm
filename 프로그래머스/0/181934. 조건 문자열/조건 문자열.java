class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        
        if (">".equals(ineq) && "=".equals(eq)) {
            answer = (n >= m);
        } else if (">".equals(ineq) && "!".equals(eq)) {
            answer = (n > m);
        } else if ("<".equals(ineq) && "=".equals(eq)) {
            answer = (n <= m);
        } else {
            answer = (n < m);
        }
        
        return answer ? 1 : 0;
    }
}