import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        MyArr myArr = new MyArr(Arrays.copyOf(arr, arr.length));
        int[] answer = new int[0];
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            boolean isEven = (i % 2 == 0);
            answer = myArr.getNewArr(idx, isEven);
        }
        return answer;
    }
}

class MyArr {
    private int[] arr;
    
    public MyArr(int[] arr) {
        this.arr = arr;
    }
    
    public int[] getNewArr(int idx, boolean isEven) {
        return isEven ? getEvenIdxArr(idx) : getOddIdxArr(idx);
    }
    
    private int[] getOddIdxArr(int idx) {
        int len = arr.length - idx;
        int[] temp = new int[len];
        
        for (int i = idx, z = 0; i < arr.length; i++, z++) {
            temp[z] = arr[i];
        }
        arr = temp;
        return arr;
    }
    
    private int[] getEvenIdxArr(int idx) {
        int len = idx + 1;
        int[] temp = new int[len];
        
        for (int i = 0, z = 0; i < len; i++, z++) {
            temp[z] = arr[i];
        }
        arr = temp;
        return arr;
    }
}