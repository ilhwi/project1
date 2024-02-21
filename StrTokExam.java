package p0221_01;
import java.util.StringTokenizer;

public class StrTokExam {
	public static void main(String[] args) {
		String source1 = "123-456|경기도|수원시|태태동";
		StringTokenizer st1 = new StringTokenizer(source1, "|"); 
		String zipCode = st1.nextToken();
		String doo = st1.nextToken();
		String si = st1.nextToken();
		String dong = st1.nextToken();
		System.out.println(zipCode);
		System.out.println(doo);
		System.out.println(si);
		System.out.println(dong);
		
		String suorce2 = "한국 미국 태국 중국 이란 일본";
		StringTokenizer st2 = new StringTokenizer(suorce2);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		String suorce3 = "한국,미국,태국,중국,이란,일본";
		StringTokenizer st3 = new StringTokenizer(suorce3,",",true);
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
	}
}
