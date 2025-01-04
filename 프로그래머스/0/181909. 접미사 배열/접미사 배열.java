import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        // 접미사 구하기
        answer = getSuffix(my_string);
        
        // 사전순으로 정렬하기
        answer = sort(answer);
        
        return answer;
    }
    
    private String[] getSuffix(String words) {
        List<String> list = new ArrayList<>();
        int lastIdx = words.length();
        
        for (int i = words.length(); i > 0; i--) {
            list.add(words.substring(i - 1, lastIdx));
        }
        
        return list.toArray(new String[0]);
    }
    
    private String[] sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}