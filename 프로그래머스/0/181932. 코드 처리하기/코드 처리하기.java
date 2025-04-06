class Solution {
    public String solution(String code) {
        String[] strArr = code.split("");
        boolean mode = false;
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < strArr.length; i++) {
            String s = strArr[i];
            if ("1".equals(s)) {
                mode = !mode;
                continue;
            }
            s = (!mode && i % 2 == 0) || (mode  && i % 2 == 1) ? s : "";
            answer.append(s);
        }
        
        return answer.toString().isEmpty() ? "EMPTY" : answer.toString();
    }
}