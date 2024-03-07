package P0307;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamExam {
	public static void main(String[] args) {
		FileOutputStream fo = null;
		FileInputStream fi = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fo = new FileOutputStream("c:\\data\\test.txt");
			fi = new FileInputStream("c:\\data\\test.txt");
			dos = new DataOutputStream(fo);
			dis = new DataInputStream(fi);
			
			dos.writeShort(-1);
			dos.writeByte(2);
			dos.writeDouble(3.14);
			dos.writeLong(30);
			dos.writeUTF("tes test");
			
			System.out.println(dis.readShort());
			dis.skip(1);
			System.out.println(dis.readDouble());
			System.out.println(dis.readLong());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fo.close();
				fi.close();
				dos.close();
				dis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
