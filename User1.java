package P0312;

import java.io.Serializable;

public class User1 implements Serializable{ //직력화 인터페이스 상속
	private String id;
	private transient String passwd;
	private String dong;
	private String name;
	private transient int age; //직렬화 제외하는 키워드!
	
	User1(String id, String passwd, String dong, String name, int age){
		this.id =id;
		this.passwd = passwd;
		this.dong = dong;
		this.name = name;
		this.age= age;
	}

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

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[아이디="+id+", 비밀번호: "+passwd+", 주소 :"+dong+", 이름 ="+name+"나이="+ age +"]";
	}	
	
}
