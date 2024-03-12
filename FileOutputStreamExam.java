package P0312;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExam {
	public static void main(String[] args) {
		int data = 0;
		System.out.println("저장할 내용 입력");
		
		try {
			File file =new File("c:\\data\\testt.txt");
			FileOutputStream fos = new FileOutputStream(file, true);
			while((data = System.in.read()) != -1) {
			fos.write(data);
			}
//			data = System.in.readAllBytes();
//			fos.write(data);
			fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

