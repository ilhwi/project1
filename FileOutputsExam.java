package P0307;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputsExam {
	public static void main(String[] args) {
		FileOutputStream fo = null;
		
		String msg = "Bye World ";
		byte[] byteArray = msg.getBytes();
		
		try {
			fo = new FileOutputStream("c:\\data\\test.txt", true); // 확장모드
			fo.write(byteArray);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				fo.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
