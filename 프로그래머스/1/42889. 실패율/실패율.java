import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] arr = new double[N + 1];
        for (int s : stages) {
            if (s == N + 1) {
                continue;
            }
            arr[s]++;
        }

        List<Integer> list1 = new LinkedList<>(); // 0 아닌 애들 idx 리스트
        List<Integer> list2 = new LinkedList<>(); // 0인 애들 idx 리스트
        int len = stages.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0.0) {
                list2.add(i);
                continue;
            }
            int val = (int) arr[i];
            arr[i] /= len;
            len -= val;
            list1.add(i);
        }
        
        List<Integer> list3 = new LinkedList<>(); // 0 아닌 애들 idx 리스트 정렬
        double[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        int idx = arr.length - 1;
        while (arr2[idx] != 0) {
            for (int i = 0; i < list1.size(); i++) {
                int arrIdx = list1.get(i);
                if (arr[arrIdx] == arr2[idx]) {
                    list3.add(arrIdx);
                    list1.remove(i);
                    idx--;
                    break;
                }
            }
        }
        
        List<Integer> list4 = new LinkedList<>();
        list4.addAll(list3);
        list4.addAll(list2);
        
        return list4.stream().mapToInt(Integer::intValue).toArray();
    }
}