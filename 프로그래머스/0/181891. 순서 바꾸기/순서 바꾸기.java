class Solution {
    public int[] solution(int[] num_list, int n) {
        int l = num_list.length;
        int[] answer = new int[l];
        for (int i = 0; i < l; i++) {
            answer[i] = num_list[(i + n) % l];
        }
        return answer;
    }
}