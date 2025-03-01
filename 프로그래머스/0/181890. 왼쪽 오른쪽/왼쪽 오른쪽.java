class Solution {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        int direction = -1;
        int idx = -1;
        
        for (int i = 0; i < str_list.length; i++) {
            String str = str_list[i];
            if (direction == -1) {
               idx = i;
               if ("l".equals(str)) {
                    direction = 0;
                } else if ("r".equals(str)) {
                    direction = 1;
                }
            }
            
            sb.append(str);
        }
        
        String string = sb.toString();
        
        if (direction == 0) {
            string = string.substring(0, idx);
        } else {
            string = string.substring(idx + 1);
        }
        
        int result = 0;
        
        if (string.isEmpty()) {
            result = 1;
        }
        
        return result == 1 ? new String[0] : string.split("");
    }
}