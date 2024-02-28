package P0227_01;

import java.util.HashMap; // 해쉬맵
import java.util.Map;     // 임포트 위해서
import java.util.Scanner;

public class UserSVC {
	Scanner scan = new Scanner(System.in);
	private Map<String, User> userMap;
	private String id;
	private String passwd;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public UserSVC() {
		userMap = new HashMap<>();
		initUser();
	}
	
	private void initUser() {
		userMap.put("user1",new User("user1","pass1","동1",30,"홍길동"));
		userMap.put("user2",new User("user2","pass2","동2",31,"홍길자"));
		userMap.put("user3",new User("user3","pass3","동3",32,"홍길순"));
		userMap.put("user4",new User("user4","pass4","동4",33,"홍길직"));
		userMap.put("user5",new User("user5","pass5","동5",34,"홍길표"));
	}
	
	public boolean authUser(String id, String passwd) { //아이디 검사
		if(userMap.containsKey(id)) {
			User user = userMap.get(id); 
			return user.getPasswd().equals(passwd);
		}
		return false;
	} 
	public void registerUser() { //회원가입
		System.out.println("===============");
		System.out.println("=회원가입 창 입니다=");
		System.out.println("===============");
		System.out.print("아이디를 입력해주세요>>> ");
		String id = scan.next();
		System.out.print("비밀번호를 입력해주세요>>> ");
		String passwd = scan.next();
		System.out.println("동일 아이디 검사하는 중 ");
		if(!authUser(id,passwd)) {
			System.out.println("중복이 없군요! 가입 시작");
			System.out.println("동을 입력해주세요");
			String dong = scan.next();
			System.out.println("나이를 입력해주세요");
			int age = scan.nextInt();
			System.out.println("이름을 입력해주세요");
			String name = scan.next();
			userMap.put(id,new User(id,passwd,dong,age,name));
//			System.out.println(userMap.get(id)); 잘들어갓는지 확인
		}else {
			System.out.println("중복입니다. 다시 확인해주세요");
		}
	}
	public boolean Login() {
		System.out.println("==로그인 창입니다==");
		System.out.print("아이디 입력해주세요>> ");
		String id = scan.next();
		if(userMap.containsKey(id)) {
//			id에 밸류를 받앙좌
			User users = userMap.get(id);
			System.out.print("비밀번호를 입력해주세요>> ");
			String passwd = scan.next();
			if(users.getPasswd().equals(passwd)){
				System.out.println("==로그인 되었습니다==");
				setId(id);
				setPasswd(passwd);
				return true;
			}else {
				System.out.println("==비밀번호가 틀렸습니다==");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		return false;
	}

}
