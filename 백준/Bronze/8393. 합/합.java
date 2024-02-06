import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int answer = 0;
        for(int i=0; i<length; i++){
            answer += (i+1);
        }
        
        System.out.println(answer);
    }//main ends
}//class ends