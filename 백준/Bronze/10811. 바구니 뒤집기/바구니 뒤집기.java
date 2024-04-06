import java.util.*;
import java.io.*;

public class Main  {
    public static void main (String[] args){
        
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // n이랑 m
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);
            
            // 바구니 초기화
            int[] basketList = new int[n];
            for (int i=0; i<n; i++) {
                basketList[i] = i+1;
            }
            
            // 바구니 바꾸기
            for (int k=0; k<m; k++) {
                String[] line = br.readLine().split(" ");
                int i = Integer.parseInt(line[0])-1;
                int j = Integer.parseInt(line[1])-1;
                
                if (i != j && j != 0){                
                    // 반복횟수 구하기
                    int count = (j-i) / 2 + 1;
                    int num = 0;
                    for (int l=0; l<count; l++) {
                        int temp;
                        temp = basketList[i+num];
                        basketList[i+num] = basketList[j-num];
                        basketList[j-num] = temp;
                        num++;
                    }
                }
            }
            
            // 바구니 출력
            StringBuffer sb = new StringBuffer();
            for (int i=0; i<n; i++) {
                sb.append(String.valueOf(basketList[i]));
                sb.append(" ");
            }
            
            bw.write(sb.toString().trim());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }// main ends
}// class ends