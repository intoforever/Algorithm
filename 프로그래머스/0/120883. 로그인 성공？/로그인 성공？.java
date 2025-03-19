class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String userId = id_pw[0], userPw = id_pw[1];
        
        for (String[] info : db) {
            String id = info[0], pw = info[1];
            
            if (id.equals(userId) && pw.equals(userPw)) {
                return "login";
            } else if (id.equals(userId)) {
                return "wrong pw";
            }
        }
        
        return answer;
    }
}