import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            int nums = Integer.parseInt(br.readLine());
            
            for(int i=0; i<nums; i++){
                for(int j=0; j<nums-i-1; j++){
                    bw.write(" ");
                }
                for(int k=0; k<i+1; k++){
                    bw.write("*");
                }
                bw.write("\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//main ends
}//class ends