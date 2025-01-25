class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = getMax(n, m);
        answer[1] = getMin(n, m);
        
        return answer;
    }
    
    private int getMax(int n, int m) {
        int value = 1;

        for (int i = 2; i <= Math.max(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                value = i;
            }
        }
        
        return value;
    }
    
    private int getMin(int n, int m) {
        int value = n * m;
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        for (int i = 1; i <= value; i++) {
            int multipleValue = min * i;
            
            if (multipleValue % max == 0) {
                return multipleValue;
            }
        }
        
        return value;
    }
}