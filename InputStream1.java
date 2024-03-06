package P0306;

import java.io.IOException;

public class InputStream1 {
	public static void main(String[] args) {
		int var_byte = -1;
		
		do {
			try {
				System.out.println("입력 : ");
				var_byte = System.in.read();
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(var_byte == 10 || var_byte==13) continue;
			if(var_byte == -1) break;
			System.out.print("읽은 값 : "+(char)var_byte);
		}while(true);
	}
}
