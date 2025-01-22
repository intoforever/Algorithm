class Solution {
    public int solution(int num, int k) {
        char[] arr = String.valueOf(num).toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i] - '0';
            
            if (n == k) {
                return i + 1;
            }
        }
        
        return -1;
    }
}