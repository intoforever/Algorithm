import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        //경우1
        if(A==B){
            if(B==C){
                System.out.println(10000+A*1000);
                return;
            }
            System.out.println(1000+A*100);
            return;
        }
        
        //경우2 
        else if(B==C){
            System.out.println(1000+B*100);
            return;
        }
        
        //경우3
        else if(A==C){
            System.out.println(1000+C*100);
            return;
        }
        else
            System.out.println(Math.max(Math.max(A,B),C)*100);
    }
}