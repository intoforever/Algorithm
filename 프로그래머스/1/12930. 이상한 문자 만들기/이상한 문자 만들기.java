class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            StringBuilder str = new StringBuilder(arr[i]);
            
            for (int j = 0; j < str.length(); j++) {
                if (j == 0 || j % 2 == 0) {
                    str.setCharAt(j, Character.toUpperCase(str.charAt(j)));
                }
            }
            
            sb.append(str.toString());
            
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}