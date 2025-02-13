class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[A-Za-z]", " ").split(" ");
        
        for (String a : arr) {
            a = a.trim();
            
            if ("".equals(a)) {
                continue;
            }
            
            answer += Integer.parseInt(a);
        }
        
        return answer;
    }
}