class Solution {
    public int solution(int[] arr) {
        MyArr myArr = new MyArr(arr);
        int answer = 0;
        
        while (!myArr.convertArr()) {
            answer++;
        }
        
        return answer;
    }
}

class MyArr {
    int[] arr;
    
    public MyArr(int[] arr) {
        this.arr = arr;
    }
    
    public boolean convertArr() {
        int[] convertedArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (num >= 50 && num % 2 == 0) {
                convertedArr[i] = num / 2;
            } else if (num < 50 && num % 2 == 1) {
                convertedArr[i] = (num * 2) + 1;
            } else {
                convertedArr[i] = num;
            }
        }
        
        boolean result = checkArr(convertedArr);
        arr = convertedArr;
        
        return result;
    }
    
    private boolean checkArr(int[] convertedArr) {
        for (int i = 0; i < convertedArr.length; i++) {
            if (arr[i] != convertedArr[i]) {
                return false;
            }
        }
        
        return true;
    }
}