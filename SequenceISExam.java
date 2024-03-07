package P0307;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.io.SequenceInputStream;
import java.io.IOException;
import java.util.Vector;

public class SequenceISExam {
	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		FileInputStream fin3 = null;
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		
		try{
			fin1 = new FileInputStream("c:\\data\\test1.txt");
			fin2 = new FileInputStream("c:\\data\\test2.txt");
			fin3 = new FileInputStream("c:\\data\\test3.txt");
			
			Vector v = new Vector();
			v.add(fin1);
			v.add(fin2);
			v.add(fin3);
			
			Enumeration fins = v.elements();
			si1 = new SequenceInputStream(fins);
			si2 = new SequenceInputStream(fin1,fin2);
			
			int var_readbyte = -1;
			while((var_readbyte = si1.read())!= -1) {
				System.out.print((char)var_readbyte);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				si1.close();
				si2.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
