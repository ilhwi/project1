package P0306;

import java.io.IOException;
import java.io.FileInputStream;

public class InputStream2 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		
		try {
			
			fin = new FileInputStream("c:\\data\\test.txt");
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
}
