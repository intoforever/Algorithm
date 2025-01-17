import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            String str = br.readLine();
            int idx = Integer.parseInt(br.readLine()) - 1 ;
            String answer = String.valueOf(str.charAt(idx));
            
            bw.write(answer);
            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends