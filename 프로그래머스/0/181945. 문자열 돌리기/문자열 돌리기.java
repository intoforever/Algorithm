import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String[] arr = str.split("");
        for (String a : arr) {
            System.out.println(a);
        }
    }
}