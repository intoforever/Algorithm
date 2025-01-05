class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int len = numLog.length;
        int curr = numLog[0], prev = 0;
        
        for (int i = 1; i < len; i++) {
            prev = curr;
            curr = numLog[i];
            
            switch (curr - prev) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
                default:
                    break;
            }
        }
        
        return sb.toString();
    }
}