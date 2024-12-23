import java.util.*;

class Solution
{
    public int solution(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        reverseArray(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    } // solution ends
    
    private void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
} // class ends