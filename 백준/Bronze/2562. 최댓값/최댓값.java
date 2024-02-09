import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        
        try(BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));)
        {
            int max = 0;
            int idx = 0;
        
            for(int i=0; i<9; i++){
                int current = Integer.parseInt(br.readLine());
                if(max < current){
                    idx = i+1;
                    max = current;
                }
            }

            System.out.println(max);
            System.out.println(idx);    
        }
        catch(Exception e){e.printStackTrace();}
        
    }//main ends
}//class ends