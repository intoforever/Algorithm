import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int startIdx = (n == 1) ? 0 : slicer[0];
        int endIdx = (n == 2) ? num_list.length : slicer[1] + 1;
        int jump =  (n == 4) ? slicer[2] : 1;
        
        List<Integer> list = new ArrayList<>();
        while (startIdx < endIdx) {
            list.add(num_list[startIdx]);
            startIdx += jump;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}