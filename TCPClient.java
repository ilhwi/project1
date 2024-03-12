package P0312;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;
import java.util.Scanner;


public class TCPClient {
	
		InputStream is;
		OutputStream os;
		Socket socket;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		Scanner sc;
		String msg;
		String sMsg;
		public void start() {
			while(true) {
		try {
			socket = new Socket("localhost", 5000);
			sendMessage(socket);
			receiveMessage(socket);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(sMsg.equals("exit")) {
				socket.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			}
	}
		
		private void receiveMessage(Socket socket) {
			try {
				is = socket.getInputStream();
				ois = new ObjectInputStream(is);
				msg = (String)ois.readObject();
				System.out.println(msg);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	private void sendMessage(Socket socket) {
			try {
				os= socket.getOutputStream();
				oos = new ObjectOutputStream(os);
				sc = new Scanner(System.in);
				System.out.print("보낼 메세지 : ");
				sMsg = sc.next();
				oos.writeObject(sMsg);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		new TCPClient().start();
	}
}


