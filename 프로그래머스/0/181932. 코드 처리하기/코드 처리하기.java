class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if (i % 2 == mode) {
                sb.append(c);    
            }
        }
        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}