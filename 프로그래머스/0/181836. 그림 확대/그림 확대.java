class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (String line : picture) {
            for (String str : line.split("")) {
                sb.append(str.repeat(k));
            }
            for (int m = 0; m < k; m++) {
                answer[idx++] = sb.toString();
            }
            
            sb.setLength(0);
        }
        return answer;
    }
}