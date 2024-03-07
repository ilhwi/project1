package P0307;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExam {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("c:\\data\\test.txt",true)){
			fw.write("Hello, java!\n");
			fw.write("Bye java");
			System.out.println("파일 쓰기 완료");
		}catch(IOException e) {
			System.out.print("파일 오류 발생");
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader("c:\\data\\test.txt")){
			int var_char;
			System.out.println("파일에서 읽은 데이터");
			while((var_char = fr.read()) != -1) {
				System.out.print((char)var_char);
			}
		}catch(IOException e) {
			System.out.println("파일 읽기 중 오류");
			e.printStackTrace();
		}
	}
}
