class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").trim();
        String[] answer = {"EMPTY"};
        
        if (myStr.length() != 0) {
            answer = myStr.split("\\s+");
        }
        
        return answer;
    }
}