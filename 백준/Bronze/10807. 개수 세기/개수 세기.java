import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int cnt = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int num = Integer.parseInt(br.readLine());
            int answer = 0;
            
            for(int i=0; i<cnt; i++){
                int temp = Integer.parseInt(arr[i]);
                if(temp == num)
                    answer++;
            }

            bw.write(answer+"");
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends