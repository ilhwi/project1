package P0312;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	
	public static void main(String[] args){
		User1 user1 = new User1("aaa","aaa","용계동","홍길동", 20);
		User1 user2 = null;
		FileOutputStream fos = null;
		FileInputStream fis = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			fos = new FileOutputStream("c:\\data\\userinfo.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user1);
			
			fis = new FileInputStream("c:\\data\\userinfo.ser");
			ois = new ObjectInputStream(fis);
			user2 = (User1)ois.readObject(); //바이트 이므로 형변환해줘야한다.
			System.out.println(user2);
			if(user2.getAge()==20){
				System.out.println("passwd");
			}
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
				oos.close();
				ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}	
		}
	}
}
