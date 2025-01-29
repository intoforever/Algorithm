class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        for (char a : arr) {
            if (a != ' ') {
                if ((97 <= a && a <= 122 - n) || (65 <= a && a <= 90 - n)) {
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