class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ").trim();
        
        if (myStr.length() == 0) {
            return new String[]{"EMPTY"};
        }
        
        return myStr.split("\\s+");
    }
}