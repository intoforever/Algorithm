class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] stringArray = my_string.split("");
        
        for(int i=0; i<stringArray.length; i++)
            if(!stringArray[i].equals(letter))
                answer += stringArray[i];
        
        return answer;
    }
}