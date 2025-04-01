import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (; l <= r; l++) {
            String val = ("" + l).replace("0", "").replace("5", "");
            if ("".equals(val)) {
                list.add(l);
            }
        }
        int[] answer;
        if (list.size() > 0) {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}