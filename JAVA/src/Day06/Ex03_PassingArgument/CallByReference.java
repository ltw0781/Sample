package Day06.Ex03_PassingArgument;



import Day05.Class.Pikachu1;

/**
 * 인자전달방식
 */

public class CallByReference {
	
	public static void main(String[] args) {
		
		int arr[]= new int[5];
		Pikachu1 pikachu = new Pikachu1();
		
		
		for (int i = 0 ; i< arr.length ; i++) {
			arr[i] = (i+1);
		}
		
		System.out.println("----- main() apthem -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		
		// 레퍼런스에 의한 호출 : Call By Reference
		// - 참조 자료형을 전달하는 방식
		
		setArr(arr);
		setObject(pikachu);
		
		System.out.println("----- set**() 메소드 호출 후 -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
	}

	private static void setObject(Pikachu1 pikachu) {
		// TODO Auto-generated method stub
		pikachu.energy = 1000;
		pikachu.type = "에스퍼";
		System.out.println("----- setObject 메소드 ------");
		System.out.println(pikachu);
		System.out.println();

	}

	private static void setArr(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = (i+1) * 10;
		}
		System.out.println("----- setArr() 메소드 -----");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	



}
