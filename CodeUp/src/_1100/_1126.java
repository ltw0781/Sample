package _1100;

import java.util.Scanner;

public class _1126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ver1 = a + b;
		int ver2 = a - b;
		int ver3 = a * b;
		int ver4 = a / b;
		int ver5 = a % b;
		
		System.out.println(a + " + " + b + " = " + ver1);
		System.out.println(a + " - " + b + " = " + ver2);
		System.out.println(a + " * " + b + " = " + ver3);
		System.out.println(a + " / " + b + " = " + ver4);
		System.out.println(a + " % " + b + " = " + ver5);
		
	}

}
