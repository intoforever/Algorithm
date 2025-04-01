import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        // 이진법 활용
        // l = 5, r = 555
        // 5,   50,   55,   500,   505,   550,   555
        // 1    10    11    100    101    110    111
        // 1     2     3      4      5      6      7

        // 지수는 자릿수
        // 2^0 <= x < 2^3
        int digit = String.valueOf(r).length();
        int exponent = (int)Math.pow(2.0, digit);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < exponent; i++) {
            String binaryString = Integer.toBinaryString(i);
            int target = Integer.parseInt(binaryString) * 5;
            if (target >= l && target <= r)
                list.add(target);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}