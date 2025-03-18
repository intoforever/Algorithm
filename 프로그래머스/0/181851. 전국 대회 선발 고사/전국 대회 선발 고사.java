import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
         int answer = 0;

        Student[] student = new Student[rank.length];

        for(int i=0; i<rank.length; i++) {
            student[i] = new Student(i, rank[i], attendance[i]);
        }

        Arrays.sort(student, (o1, o2) -> o1.rank - o2.rank);

        int cnt = 0;
        int[] abc = new int[3];

        for(int i=0; i<rank.length; i++) {
            if(cnt == 3) break;

            if(student[i].attendance) {
                abc[cnt++] = student[i].num;     
            }
        }

        answer = 10000 * abc[0] + 100 * abc[1] + abc[2];

        return answer;
    }

    class Student {
        int num;
        int rank;
        boolean attendance;

        Student(int num, int rank, boolean attendance) {
            this.num = num;
            this.rank = rank;
            this.attendance = attendance;
        }
    }
}