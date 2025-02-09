class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int quotient = 0;
        int newCoke = 0;
        
        while (n >= a) {
            quotient = a * (n / a);
            newCoke = (n / a) * b;
            answer += newCoke;
            
            n = (n - quotient + newCoke);
        }
        
        return answer;
    }
}