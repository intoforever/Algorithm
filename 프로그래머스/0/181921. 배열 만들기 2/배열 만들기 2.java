import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        // binaryString() 이용해서 다시 풀어보기
        // 1 10 11 100 101 110 111
        List<Integer> list = new ArrayList<>();
        int cnt = String.valueOf(r).length();
        int exponent = (int) Math.pow(2, cnt);
        
        for (int i = 0; i < exponent; i++) {
            int target = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= target && target <= r) {
                list.add(target);
            }
        }
        
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i->i).toArray();
    }
}