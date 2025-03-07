class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int flag = 1;
        for (String a : my_string.split(" ")) {
            if ("+".equals(a)) {
                flag = 1;
                continue;
            } else if ("-".equals(a)) {
                flag = -1;
                continue;
            }
            
            answer += Integer.parseInt(a) * flag;
        }
        
        return answer;
    }
}