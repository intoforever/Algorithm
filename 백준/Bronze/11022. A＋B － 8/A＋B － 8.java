import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();

        for(int i=0; i<a; i++){
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, b, c, b+c);  
        }

	}
}