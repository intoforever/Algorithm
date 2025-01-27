class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];

            for (int j = s; j <= e; j++) {
                arr[j]++;
            }
        }
        
        return arr;
    }
}