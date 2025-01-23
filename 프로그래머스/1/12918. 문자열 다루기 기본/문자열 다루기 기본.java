class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (char a : s.toCharArray()) {
            boolean result = a - '0' < 10;

            if (!result) {
                return false;
            }
        }
        
        return true;
    }
}