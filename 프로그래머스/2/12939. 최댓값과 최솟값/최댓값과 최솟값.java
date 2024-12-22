class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringArr = s.split(" ");
        int len = stringArr.length;
        int[] intArr = new int[len];
        
        for (int i = 0; i < len; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        
        int min = intArr[0];
        int max = intArr[0];
        
        for (int i = 1; i < len; i++) {
            int num = intArr[i];
            
            if (min > num) {
                int temp = min;
                min = num;
                num = temp;
            }
            
            if (max < num) {
                int temp = max;
                max = num;
                num = temp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        answer = sb.toString();
        
        return answer;
    }
}