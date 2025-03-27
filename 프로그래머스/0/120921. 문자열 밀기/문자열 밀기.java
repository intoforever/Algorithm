class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = A.length() - 1, cnt = 0; i >= 0; i--) {
            cnt++;
            sb.append(A.substring(i));
            sb.append(A.substring(0, i));
            if (B.equals(sb.toString())) {
                return cnt;
            }
            sb.setLength(0);
        }
        return -1;
    }
}