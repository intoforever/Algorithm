class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        char[] arr = String.valueOf(age).toCharArray();
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            char val = (char)((arr[i] - '0') + 'a');
            sb.append(String.valueOf(val));
        }
        
        return sb.toString();
    }
}