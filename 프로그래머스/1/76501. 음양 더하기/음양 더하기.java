class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        
        for (int i = 0 ; i < len; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        
        return answer;
    }
}