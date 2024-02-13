class Solution {
    public int solution(int hp) {
        int j = hp/5;
        int b = (hp%5)/3;
        int i = (hp%5)%3;
        
        int answer = j + b + i;
        return answer;
    }
}