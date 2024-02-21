package p0221_01;

public class packExam {
	public static void main(String[] args) {
		int num = Integer.parseInt("0");
		try {
			int result = 10/num;
			System.out.println("result ="+result);
		}catch(ArithmeticException e) {
			System.out.println("정수 0나누면 되겟냐 ?");
		}
		System.out.println("계속됩니다.");
	}
}
