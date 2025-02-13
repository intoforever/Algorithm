class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[A-Za-z]", " ").split(" ");
        
        for (String a : arr) {
            if ("".equals(a.trim())) {
                continue;
            }
            
            answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}