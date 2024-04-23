package _1300;

import java.util.Scanner;

/**
 *  1. 3 ~ 99까지의 홀수중 하나를 입력.
 *  	--> Scanner 를 통해 변수에 입력 받는다.
 *  2. 
 *   
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 */



public class _1358 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N을 입력 받는다.
		// N = 5
		int N = sc.nextInt();
		int cheek = N / 2 + 1;   // cheek = 3  
		int num = N % 2;         // num = 2
		
		for (int i = 1 ; i <= N / 2 + 1 ; i++) {
			for (int j = 1 ; j < cheek ; j++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j < num ; j++) {
				System.out.print("*");
			}
			num+=2;
			cheek--;
			System.out.println();
			
		}
		
	}

}
