package p0221_01;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "testString";	
		String str2 = "testString";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("testString");
		String str4 = new String("testString");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = sb1.append("python");
		
		System.out.println(sb1==sb2);
		
		String str5 = new String("mon");
		String str6 = str5.concat("day"); //문자열 붙이기"
		System.out.println(str5 == str6);
				
		
	}
}
