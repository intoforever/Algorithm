import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            
            // N(바구니 수)과 M(바꾸는 횟수) 구하기
            String[] nAndM = br.readLine().split(" ");
            int n = Integer.parseInt(nAndM[0]);
            int m = Integer.parseInt(nAndM[1]);
            
            // 바구니 초기화
            int[] basket = new int[n];
            for(int i=0; i<n; i++){
                basket[i] = i+1;
            }
            
            // 공 바꾸기
            for(int i=0; i<m; i++){
                
                // 줄 읽고 바꿀 바구니 지정
                String[] line = br.readLine().split(" ");
                int temp;
                int a = Integer.parseInt(line[0])-1;
                int b = Integer.parseInt(line[1])-1;
                            
                swap(a,b,basket);
            }
            
            // 출력하기
            StringBuilder sb = new StringBuilder();
            for(int b:basket){
                sb.append(b).append(" ");
            }
            
            bw.write(sb.toString());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//main ends
    
    // 값 바꾸는 함수 정의
    public static void swap(int a, int b, int[] arr){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }//swap ends
    
}//class ends