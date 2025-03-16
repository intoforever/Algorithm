class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        int e = s + overwrite_string.length();
        sb.replace(s, e, overwrite_string);
        return sb.toString();
    }
}