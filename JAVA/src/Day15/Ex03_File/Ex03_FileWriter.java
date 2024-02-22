package Day15.Ex03_File;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileWriter {
	
	public static void main(String[] args) {
		FileWriter fw = null;
		String str = "텍스트 파일에 출력할 내용";
		
		try {
			
			fw = new FileWriter("./src/Day15/Test2.txt");
			fw.write(str, 0, str.length());
			fw.close();
			System.out.println("텟스트 파일이 저장되었습니다.");
		} catch (IOException e) {
			System.err.println("입출력시, 에러가 발생했습니다.");
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	
}
