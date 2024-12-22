class Solution {
    public String solution(String s) {
        String[] stringArr = s.split(" ");
        int min, max;
        min = max = Integer.parseInt(stringArr[0]);
        
        for (int i = 0; i < stringArr.length; i++) {
            int num = Integer.parseInt(stringArr[i]);
            
            if (min > num) min = num;
            if (max < num) max = num;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}