import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xNum = 0, num = 0;
        
        for (String s : polynomial.split(" \\+ ")) {
            if (s.contains("x")) {
                xNum += "x".equals(s) ? 1 : Integer.parseInt(s.replace("x", ""));
            } else {
                num += Integer.parseInt(s);
            }
        }
        
        if (xNum == 0) {
            return String.valueOf(num);
        }
        if (num == 0) {
            return xNum == 1 ? "x" : xNum + "x";
        }
        
        return (xNum == 1 ? "x" : xNum + "x") + " + " + num;
    }
}