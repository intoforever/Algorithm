import java.io.*;

public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            // n과 m값 초기화
            String[] nAndM = br.readLine().split(" ");
            int n = Integer.parseInt(nAndM[0]); // 바구니 갯수
            int m = Integer.parseInt(nAndM[1]); // 총 바꾸는 횟수
            
            // 바구니 초기화
            int[] basket = new int[n];
            for(int i=0; i<basket.length; i++)
                basket[i] = 0;
            
            // 바구니 공 바꾸기
            for(int i=0; i<m; i++){
                
                String[] ijk = br.readLine().split(" ");
                int startBasket = Integer.parseInt(ijk[0]);
                int endBasket = Integer.parseInt(ijk[1]);
                int num = Integer.parseInt(ijk[2]);
                
                for(int j=0; j<(endBasket-startBasket)+1; j++)
                    basket[startBasket-1+j] = num;    
            }
            
            // 바구니 출력하기
            for(int i=0; i<basket.length; i++)
                bw.write(basket[i] + " ");
            
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends