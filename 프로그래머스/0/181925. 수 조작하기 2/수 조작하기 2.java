class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int len = numLog.length;
        int val = numLog[0];
        
        for (int i = 1; i < len; i++) {
            int num = numLog[i];
            if (num == val + 1) {
                sb.append("w");
            } else if (num == val - 1) {
                sb.append("s");
            } else if (num == val + 10) {
                sb.append("d");
            } else if (num == val - 10) {
                sb.append("a");
            }
            
            val = num;
        }
        
        return sb.toString();
    }
}