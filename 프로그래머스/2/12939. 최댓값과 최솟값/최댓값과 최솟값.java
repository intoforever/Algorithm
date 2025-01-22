class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for (String a : arr) {
            int num = Integer.parseInt(a);
            
            if (min > num) {
                min = num;
            }
            
            if (max < num) {
                max = num;
            }
        }
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}