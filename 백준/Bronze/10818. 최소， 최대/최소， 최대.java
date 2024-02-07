import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int len = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[0]);
            
            for(int i=0; i<len; i++){
                int current = Integer.parseInt(arr[i]);
                max = Math.max(max, current);
                min = Math.min(min, current);
            }
            bw.write(min + " " + max);
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends