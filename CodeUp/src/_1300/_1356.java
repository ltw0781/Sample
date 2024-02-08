package _1300;


/**
 * 1. 
 * 2. 
 * 3. 
 * 4. 
 * 5. 
 */

import java.util.Scanner;

public class _1356 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			if(i == 1 || i == N) {
				for (int j = 1 ; j <= N ; j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for (int j = 1 ; j <= N-2 ; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
