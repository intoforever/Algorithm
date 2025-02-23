class Solution {
    public int solution(int[] arr) {
       int count = 0;
        
        while (true) {
            boolean changed = false;
            
            for (int i = 0; i < arr.length; i++) {
                int original = arr[i];
                
                if (original >= 50 && original % 2 == 0) {
                    arr[i] = original / 2;
                } else if (original < 50 && original % 2 == 1) {
                    arr[i] = original * 2 + 1;
                }
                
                if (arr[i] != original) {
                    changed = true;
                }
            }
            
            if (!changed) break;
            count++;
        }
        
        return count;
    }
}