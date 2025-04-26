import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xNum = 0, num = 0;
        
        for (String s : polynomial.replace(" ", "").split("\\+")) {
            if ("x".equals(s)) {
                s = "1x";
            }
            if (s.contains("x")) {
                s = s.replace("x", "");
                xNum += s.isEmpty() ? 1 : Integer.parseInt(s);
            } else {
                num += Integer.parseInt(s);
            }
        }
        
        return formatting(xNum, num);
    }
    
    public String formatting(int xNum, int num) {
        StringBuilder sb = new StringBuilder();
        
        if (xNum > 1) {
            sb.append(xNum);
        }
        if (xNum > 0) {
            sb.append("x");
        }
        if (xNum > 0 && num > 0) {
            sb.append(" + ");
        }
        if (num > 0) {
            sb.append(num);
        }
        
        return sb.toString();
    }
}