import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums, a, b;
        nums = sc.nextInt();
        
        for(int i=0; i<nums; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.printf("Case #%d: %d\n", i+1, a+b);
        }
    }//main ends
}//class ends