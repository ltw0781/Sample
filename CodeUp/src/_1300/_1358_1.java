package _1300;

import java.util.Scanner;

public class _1358_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N / 2 + 1;
		int b = N / 2;
		
		for (int i = 1 ; i <= N / 2 +1 ; i++) {
			for (int j = 1 ; j < a ; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1 ; j < b ; j++) {
				System.out.print("*");
				
			}
			a--;
			b+=2;
			System.out.println();
		}
	}

}
