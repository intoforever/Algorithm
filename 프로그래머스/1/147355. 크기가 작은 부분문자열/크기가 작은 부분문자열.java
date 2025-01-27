class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pValue = Long.parseLong(p);
        int strLen = p.length();
        
        for (int i = 0; i < t.length() - strLen + 1; i++) {
            String str = t.substring(i, i + strLen);
            long target = Long.parseLong(str);
            
            if (target <= pValue) {
                answer++;
            }
        }
        
        return answer;
    }
}