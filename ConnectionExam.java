package p0315;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import P0312.User1;

import java.sql.ResultSet;

public class ConnectionExam {
	
	Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public String test(String val) {
		if(val.length()>10) {
			return test(val);
		}else {
			return val;
		}
	}
	
	private User1 userINPUT() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("id 입력해주세요 10글자 안으로");
			String id = scanner.next();
			if(test(id)!=null) {
				System.out.println("비번 입력해주세요 10글자 안으로");
				String passwd = scanner.next();
				if(test(passwd)!= null) {
					System.out.println("dong 입려해주세요 10글자 안으로");
					String dong = scanner.next();
					if(test(dong)!= null) {
						System.out.println("이름 입력해주세요 10글자 안으로");
						String name = scanner.next();
						if(test(name)!= null) {
							System.out.println("나이 입력하세요 숫자로");
							int age = scanner.nextInt(); 
							return new User1(id,passwd,dong,name,age);
						}
					}
				}
			}
		}
	}
	public void connect() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", 
												"c##TEST1", "1234");
			System.out.println("Connection succes... ");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		Statement stmt = null;
		User1 user = userINPUT();
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO Userlist VALUES('"+user.getId()+"','"+user.getPasswd()+"','"+user.getDong()+"','"+user.getName()+"','"+user.getAge()+"')";
			int count = stmt.executeUpdate(sql); // 결과값 받아서 확인하는거
			if(count>0) {
				System.out.println("insert success..");
			}else {
				System.out.println("insert fail..");
			}
		}catch(SQLException e) {
			System.out.println("insert fail...");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}
	
		public static void main(String[] args) {
			ConnectionExam ce = new ConnectionExam();
			ce.connect();
			ce.insert();
	}
}
