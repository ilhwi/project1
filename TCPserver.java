package P0312;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver extends Thread{
	
	private InputStream is;
	private OutputStream os;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	private ServerSocket serverSocket;
	
	public void run() {
		try {
			serverSocket = new ServerSocket(5000);
			while(true) {
				System.out.println("요청 대기");
				socket = serverSocket.accept();
				System.out.println("접속한 클라이언트:"+socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("클라이언트에서 보낸 메세지: "+msg);
				String retMsg = "서버에서 되돌아온 메세지"+msg;
				oos.writeObject(retMsg);
				if(msg.equals("exit")) {
				socket.close();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new TCPserver().start();
	}
}
