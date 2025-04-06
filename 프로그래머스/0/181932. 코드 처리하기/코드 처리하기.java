class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
                continue;
            }
            if ((!mode && i % 2 == 0) || (mode && i % 2 == 1)) {
                sb.append(c);    
            }
        }
        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}