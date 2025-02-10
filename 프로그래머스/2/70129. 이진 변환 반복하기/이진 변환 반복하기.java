class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] answer = new int[2];
        int len = s.length();
        int turn = 0;
        int cnt = 0;
        
        while (!"1".equals(s)) {
            sb.setLength(0);
            
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    cnt++;
                    continue;
                }
                sb.append(c);
            }
            
            s = Integer.toBinaryString(sb.length());
            turn++;
        }

        answer[0] = turn;
        answer[1] = cnt;
        
        return answer;
    }
}