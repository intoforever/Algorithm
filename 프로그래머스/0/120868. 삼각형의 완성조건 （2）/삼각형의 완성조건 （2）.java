class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sideA = sides[0];
        int sideB = sides[1];
        int gap = Math.max(sideA, sideB) - Math.min(sideA, sideB);

        for (int i = gap + 1; i < sideA + sideB; i++) {
            answer++;
        }
        
        return answer;
    }
}