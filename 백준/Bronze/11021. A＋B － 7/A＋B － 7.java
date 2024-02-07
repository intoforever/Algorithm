import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int nums, a, b;
            String temp;
            String[] arr;
            
            nums = Integer.parseInt(br.readLine());
            for(int i=0; i<nums; i++){
                temp = br.readLine();
                arr = temp.split(" ");
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
            
                bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends