import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int a, b;
            String line;
            String[] temp;
            
            line = br.readLine();
            while(!line.equals("0 0")){
                temp = line.split(" ");
                a = Integer.parseInt(temp[0]);
                b = Integer.parseInt(temp[1]);
                
                bw.write((a+b) + "\n");
                line = br.readLine();
            }

            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends