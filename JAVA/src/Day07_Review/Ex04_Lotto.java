package Day07_Review;

/**
 * package DAY07.Review;

public class Ex04_Lotto2 {

   public static void main(String[] args) {

      int arr[] = new int[6];
      int temp;

      for (int i = 0; i < 6; i++) {
         arr[i] = (int) (Math.random() * 45) + 1;
         
         for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) { // 중복제거
               i--;
               break;
            }
         }
      }

      // 오름차순
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < i; j++) {
            if (arr[i] < arr[j]) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }

      // Arrays.sort(arr); // 그냥 메소드 사용하기.. 개 쉬운거였음;;

      // 출력
      for (int i : arr) {
         System.out.print(i + " ");
      }
      
      

   }
}
 */

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		
		
		//  math.random() : 0.XXXXXXX~0.9XXXXXX 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~ 6 사이의 정수 : 주사위
		// math.random ()		: 0.XXXXX~0.9XXXXXX
		// math.random() * 10	: X.XXXXX~9.XXXXXXX
		// (int) (Math.random() * 10)	: 0~9 (10개)
		// (int) (Math.random() * 6) : 0 ~ 5 (5개)
		// (int) (Math.random() * 6) + 1 : 1~ 6 (6개)
		int dice = (int) (Math.random() *6)+1;
		System.out.println("주사위 : " + dice);
		
		// 1 ~45 사이의 정수 : 로또
		
		
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("로또번호 : " + lotto);
		
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		
		//1~20 사이의 랜덤수
		int num1 = (int) (Math.random() * 20)+1;
		System.out.println("랜덤 숫자(20까지) : " + num1);
		
		
		// -20 ~ 20 사이의 랜덤수
		int num2 = (int) (Math.random() * 41)-20;
		System.out.println("-20~20 : " + num2);
		
		
		// 1~ 45사이의 랜덤수 6개를 배열에 (중복없이 오름차순)으로 저장하시오
		// (과제) : 중복제거, 오름차순 정렬
		int arr[] = new int[6];
		for (int i = 0 ; i < arr.length ; i++) {
			int r = (int) (Math.random() * 45 +1);
			arr[i] = r;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
