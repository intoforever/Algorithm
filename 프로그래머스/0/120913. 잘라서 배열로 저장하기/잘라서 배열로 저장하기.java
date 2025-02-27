class Solution {
    public String[] solution(String my_str, int n) {
        int quotient = my_str.length() / n;
        int len = my_str.length() % n == 0 ? quotient : quotient + 1; 
        String[] answer = new String[len];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0, idx = 0; i < my_str.length(); i++) {
            if (i != 0 && i % n == 0) {
                answer[idx++] = sb.toString();
                sb.setLength(0);
            }
            
            sb.append(my_str.charAt(i));
            
            if (i == my_str.length() - 1) {
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}