class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        String[] arr = str.split("");
        StringBuilder sb = new StringBuilder();
        
        int len = arr.length;
        
        char[] charArr = new char[len];
        
        for (int i = 0; i < len; i++) {
            charArr[i] = (char) (97 + Integer.parseInt(arr[i]));
            sb.append(String.valueOf(charArr[i]));
        }
        
        return sb.toString();
    }
}