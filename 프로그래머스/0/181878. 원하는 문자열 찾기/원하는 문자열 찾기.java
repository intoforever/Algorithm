class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myString_ = myString.toLowerCase();
        String pat_ = pat.toLowerCase();
        
        if(myString_.contains(pat_))
            answer = 1;
        
        return answer;
    }
}