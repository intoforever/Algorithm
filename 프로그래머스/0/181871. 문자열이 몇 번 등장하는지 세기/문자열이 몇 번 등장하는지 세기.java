class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        
        for (int i = 0; i < len; i++) {
            if (myString.substring(i).startsWith(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}