class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int leftOver = 0;
        
        while (chicken / 10 != 0) {
            leftOver = (chicken % 10);
            chicken /= 10;
            answer += chicken;
            chicken += leftOver;
            
        }
        
        if (leftOver >= 10) {
            answer += leftOver / 10;
        }
        
        return answer;
    }
}