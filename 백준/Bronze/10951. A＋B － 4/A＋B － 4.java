import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try(
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            String line = br.readLine();
            while(line != null && !line.equals("")){
                String[] temp = line.split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                
                bw.write((a+b) + "\n");
                line = br.readLine();
            }
            
            bw.flush();
            bw.close();
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//main ends
}//class ends