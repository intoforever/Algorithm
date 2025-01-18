class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        
//         while (num2 != 1 && answer < 500) {
//             if (num2 % 2 == 0) {
//                 num2 /= 2;
//             } else {
//                 num2 = num2 * 3 + 1;
//             }
//             answer++;
//         }
        
        for (int i = 0; i < 500; i++) {
            if (num2 == 1) {
                break;
            }
            
            if (num2 % 2 == 0) {
                num2 /= 2;
            } else {
                num2 = num2 * 3 + 1;
            }
            
            answer++;
        }
            
        answer = (answer == 500) ? -1 : answer;
        
        return answer;
    }
}