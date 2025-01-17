class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int answer = 0;
        
        for (String a : arr) {
            answer += Integer.parseInt(a);
        }
        
        return answer % 9;
    }
}