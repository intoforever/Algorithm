class Solution {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        
        if (isInteger(result)) {
            result = result + 1;
            answer = (long) Math.pow(result, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    } // main ends
    
    private boolean isInteger (double num) {
        return num == (int) num;
    }
} // class ends