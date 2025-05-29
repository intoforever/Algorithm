import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Lotto lot = new Lotto(lottos, win_nums);
        return new int[]{lot.getMaxRank(), lot.getMinRank()};
    }
    
    static class Lotto {
        private int[] lottos;
        private int[] winLottos;
        
        public Lotto(int[] lottos, int[] winLottos) {
            this.lottos = lottos;
            this.winLottos = winLottos;
        }
        
        private List<Integer> getMyLottoNum() {
            List<Integer> list = new ArrayList<>();
            for (int lotto : lottos) {
                if (lotto == 0) {
                    continue;
                }
                list.add(lotto);
            }
            return list;
        }
        
        private int cntZero() {
            int zeroCnt = 0;
            
            Arrays.sort(lottos);
            for (int lotto : lottos) {
                if (lotto != 0) {
                    break;
                }
                zeroCnt++;
            }
            
            return zeroCnt;
        }
        
        private int cntEqualNums() {
            List<Integer> lottoNumList = getMyLottoNum();
            int cnt = 0;
            for (Integer num : lottoNumList) {
                for (int i = 0; i < winLottos.length; i++) {
                    if (num == winLottos[i]) {
                        cnt++;
                        break;
                    }
                }
            }
            return cnt;
        }
        
        public int getMaxRank() {
            int max = cntEqualNums() + cntZero();
            return 7 - max == 7 ? 6 : 7 - max;
        }
        
        public int getMinRank() {
            int min = cntEqualNums();
            return 7 - min == 7 ? 6 : 7 - min;
        }
    }
}