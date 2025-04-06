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
            c = (!mode && i % 2 == 0) || (mode  && i % 2 == 1) ? c : '0';
            sb.append(c);
        }
        String answer = sb.toString().replace("0", "");
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}