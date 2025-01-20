class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        
        if (len <= 4) {
            return phone_number;
        }
            
        StringBuilder sb = new StringBuilder();
        String[] arr = phone_number.split("");
        
        for (int i = 0; i < len; i++) {
            if (i <= len - 5) {
                sb.append("*");
            } else {
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}