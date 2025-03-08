class Solution {
    public String solution(String a, String b) {
        String answer;
        if (a.length() >= b.length()) {
            answer = getSumValue(a, b);
        } else {
            answer = getSumValue(b, a);
        }
        return answer;
    }
    
    private String getSumValue(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int flag = 0, len1 = num1.length(), len2 = num2.length(), gap = Math.abs(len1 - len2);
        
        if (gap > 0) {
            for (int i = 0; i < gap; i++) {
                sb.append(0);
            }

            sb.append(num2);
            num2 = sb.toString();
            sb.setLength(0);
        }
        
        for (int i = num2.length() - 1; i >= 0; i--) {
            int val1 = num1.charAt(i) - '0';
            int val2 = num2.charAt(i) - '0';
            sb.append((val1 + val2 + flag) % 10);
            flag = ((val1 + val2 + flag) / 10);
        }
        
        if (flag == 1) {
            sb.append(flag);
        }
        
        return sb.reverse().toString();
    }
}