import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            int len = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < len; i++) {
                String str = br.readLine();
                StringBuilder sb = new StringBuilder();
                String first = String.valueOf(str.charAt(0));
                String last = String.valueOf(str.charAt(str.length() - 1));
                
                sb.append(first);
                sb.append(last);
                System.out.println(sb.toString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends