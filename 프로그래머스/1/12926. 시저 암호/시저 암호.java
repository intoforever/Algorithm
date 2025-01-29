class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char a : s.toCharArray()) {
            if (a != ' ') {
                if (('a' <= a && a <= 'z' - n) || ('A' <= a && a <= 'Z' - n)) {
                    a = (char) (a + n);
                } else {
                    a = (char) (a + n - 26);
                }
            }
            
            sb.append(a);
        }
        
        return sb.toString();
    }
}