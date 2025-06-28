class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            boolean isPlus = true, isOperatorEnd = false;
            String q = quiz[i];
            int sum = 0, num = 0;
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
                    if (isPlus) {
                        sum += num;
                    } else {
                        sum -= num;
                    }
                } else {
                    answer[i] = (sum == num) ? "O" : "X";
                }
            }
        }
        
        return answer;
    }
}