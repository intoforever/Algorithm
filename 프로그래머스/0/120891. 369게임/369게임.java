class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();
        
        for (char a : arr) {
            if ((a - '0') == 0) {
                continue;
            }
            
            if ((a - '0') % 3 == 0) {
                System.out.println("a: " + a + ", a - 0: " + (a - '0') + ", %3 == 0: " + ((a - '0') % 3));
                answer++;
            }
        }
        
        return answer;
    }
}