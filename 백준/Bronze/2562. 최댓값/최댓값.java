import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Num[] = new int[9];

		int Max = 0;
		int MaxCount = 0;

		for (int i = 0; i < Num.length; i++) {
			Num[i] = sc.nextInt();
		}
		//최댓값 구하기
		for (int k = 0; k < Num.length; k++) {
			if (Num[k] > Max) {
				Max = Num[k];
				MaxCount = k + 1;
			}
		}
		System.out.println(Max);
		System.out.println(MaxCount);
	}
}