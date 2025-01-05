class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int len = numLog.length;
        int curr = numLog[0], prev = 0;
        
        for (int i = 1; i < len; i++) {
            prev = curr;
            curr = numLog[i];
            
            if (curr == prev + 1) {
                sb.append("w");
            } else if (curr == prev - 1) {
                sb.append("s");
            } else if (curr == prev + 10) {
                sb.append("d");
            } else if (curr == prev - 10) {
                sb.append("a");
            }
        }
        
        return sb.toString();
    }
}