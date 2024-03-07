package P0307;
import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExam {
	public static void main(String[] args) {
		byte[] datas = new byte[] {13 ,24, 33, 55};
		
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readbai = -1;
		
		while((var_readbai = bai.read())!= -1) {
			System.out.print((char)var_readbai+" ");
		}
				
	}
}
