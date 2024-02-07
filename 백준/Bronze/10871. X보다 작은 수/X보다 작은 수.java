import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            String[] lenAndNum = br.readLine().split(" "); //첫 번째 줄
            String[] arr = br.readLine().split(" "); //두 번째 줄
            int len = Integer.parseInt(lenAndNum[0]); //갯수
            int num = Integer.parseInt(lenAndNum[1]); //비교할 기준 수
            
            for(int i=0; i<len; i++){
                if(Integer.parseInt(arr[i])<num)
                    bw.write(arr[i] + " ");
            }

            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends