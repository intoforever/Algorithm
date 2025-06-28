class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            boolean isPlus = true, isOperatorEnd = false;
            int sum = 0, num = 0;
            String q = quiz[i];
            
            for (String s : q.split(" ")) {
                if ("+".equals(s)) {
                    isPlus = true;
                    continue;
                } else if ("-".equals(s)) {
                    isPlus = false;
                    continue;
                } else if ("=".equals(s)) {
                    isOperatorEnd = true; 
                    continue;
                } else {
                    num = Integer.parseInt(s);
                }
                
                if (!isOperatorEnd) {
                    sum += isPlus ? num : num * -1;
                } else {
                    answer[i] = (sum == num) ? "O" : "X";
                }
            }
        }
        
        return answer;
    }
}