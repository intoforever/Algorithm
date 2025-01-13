class Solution {
    public boolean solution(int x) {
        String[] strArr = String.valueOf(x).split("");
        int len = strArr.length;
        int[] intArr = new int[len];
        int sum = 0;
        
        for (int i = 0; i < len; i ++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            sum += intArr[i];
        }
        
        return (x % (sum) == 0 ? true : false);
    }
}