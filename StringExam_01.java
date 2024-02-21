package p0221_01;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

class Student{
	String name;
	int number;
	
	public Student(String name, int number) {
		super(); //생성자에는 생략되어있다.
		this.name = name;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		Student st = null;
		if(obj instanceof Student) {
			st = (Student)obj;
		}
		return st != null && st.name.equals(this.name) && st.number==number; 
	}
	@Override
	public String toString() {
		return "이름 :" +name + "번호" + number;
	}
		
	
}

public class StringExam_01 {
	public static void main(String[] args) {
		
		
		Student st1 = new Student("홍길동",5);
		Student st2 = new Student("홍길동",5);
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		System.out.println("ABCE");
		System.out.println(st1);
		System.out.println(st2);
//		int var = 3;
//		Integer intObj = new Integer(var);
		
//		Integer intObj2 = var;
//		
//		Integer intObj3 = new Integer("5");
//		int var2 = intObj3.intValue();
//		int var3 = intObj3;
		Date date1 = new Date();
		System.out.println(date1.getYear()+1900);
		System.out.println(date1.getDate()+1);
		System.out.println(date1);
		
		Calendar myC = Calendar.getInstance();
		myC.set(Calendar.YEAR, 2024);
		//출력 형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		DateFormat df = DateFormat.getDateInstance();
		Date date = myC.getTime();
		
		//출력
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
		
		int num = MAX(Math.random());
		System.out.println(num);
	}

	private static int MAX(double random) {
		// TODO Auto-generated method stub
		return 0;
	}
}
