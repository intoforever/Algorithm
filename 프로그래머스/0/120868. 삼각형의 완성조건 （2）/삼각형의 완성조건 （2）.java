class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sideA = sides[0];
        int sideB = sides[1];

        for (int i = Math.abs(sideA - sideB) + 1; i < sideA + sideB; i++) {
            answer++;
        }
        
        return answer;
    }
}