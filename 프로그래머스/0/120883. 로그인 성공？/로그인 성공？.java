class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String userId = id_pw[0], userPw = id_pw[1];
        
        for (String[] info : db) {
            String id = info[0], pw = info[1];
            
            if (id.equals(userId)) {
                if (pw.equals(userPw)) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        
        return "fail";
    }
}