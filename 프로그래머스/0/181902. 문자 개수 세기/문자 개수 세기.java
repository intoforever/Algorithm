class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char c : my_string.toCharArray()) {
            int idx = c - 'A';
            if (Character.isLowerCase(c)) {
                idx -= 6; 
            }
            answer[idx]++;
        }
        
        return answer;
    }
}