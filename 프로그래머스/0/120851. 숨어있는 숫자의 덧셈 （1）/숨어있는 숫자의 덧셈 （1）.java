class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] charArr = my_string.toCharArray();
        
        for(char c:charArr)
            if(Character.isDigit(c))
                answer += Integer.parseInt(String.valueOf(c));
        
        
        return answer;
    }
}