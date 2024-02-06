import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String answer = "No";
        int totalPrice, kinds, price, nums, checkTotalPrice;
        
        totalPrice = sc.nextInt();
        kinds = sc.nextInt();
        checkTotalPrice = 0;
        
        for(int i=0; i<kinds; i++){
            price = sc.nextInt();
            nums = sc.nextInt();
            
            checkTotalPrice += price*nums;
        }
        
        if(totalPrice == checkTotalPrice)
            answer = "Yes";
        
        System.out.println(answer);
        
    }//main ends
}//class ends