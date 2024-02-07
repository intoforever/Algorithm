import java.util.*;
public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            sb.append("*");
            System.out.println(sb.toString());
        }
        
    }//main ends
}//class ends