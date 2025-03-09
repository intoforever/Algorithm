class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        String answer = my_string;
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            sb.append(answer.substring(0, s));
            sb.append(new StringBuilder(answer.substring(s, e + 1)).reverse().toString());
            sb.append(answer.substring(e + 1));
            answer = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}