class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0] / 2, maxY = board[1] / 2;
        
        for (String key : keyinput) {
            if ("right".equals(key)) {
                answer[0] += Math.abs(answer[0] + 1) > maxX ? 0 : 1;
            } else if ("left".equals(key)) {
                answer[0] += Math.abs(answer[0] - 1) > maxX ? 0 : -1;
            } else if ("up".equals(key)) {
                answer[1] += Math.abs(answer[1] + 1) > maxY ? 0 : 1;
            } else if ("down".equals(key)) {
                answer[1] += Math.abs(answer[1] - 1) > maxY ? 0 : -1;
            }
        }
        
        return answer;
    }
}