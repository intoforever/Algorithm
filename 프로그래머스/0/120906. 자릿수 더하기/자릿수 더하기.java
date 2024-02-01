class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String stringN = String.valueOf(n);
        String[] stringArr = stringN.split("");
        
        for(int i=0; i<stringArr.length; i++)
            answer += Integer.parseInt(stringArr[i]);

        return answer;
    }
}