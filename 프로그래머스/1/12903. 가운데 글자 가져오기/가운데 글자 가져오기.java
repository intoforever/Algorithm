class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        boolean isOdd = (len % 2 != 0);
        int idx = -1;
        
        if (isOdd) {
            idx = len / 2;
            sb.append(s.charAt(idx));
        } else {
            idx = len / 2 - 1;
            
            sb.append(s.charAt(idx));
            sb.append(s.charAt(idx + 1));
        }
        
        return sb.toString();
    }
}