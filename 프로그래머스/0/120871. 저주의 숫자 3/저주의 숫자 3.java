class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            String num = String.valueOf(answer);
            while (answer%3 == 0 || num.contains("3")) {
                answer++;
                num = String.valueOf(answer);
            }
        }
        return answer;
    }
}