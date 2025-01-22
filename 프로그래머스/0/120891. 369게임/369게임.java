class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();
        
        for (char a : arr) {
            int num = a - '0';
            if (num != 0 && num % 3 == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}