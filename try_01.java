package p0221_01;

public class try_01 {
	
	public void exceptionMethod(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result "+ result);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입려된 값이 없습니다.");
			return;
		}
		catch(NumberFormatException e) {
			System.out.println("정수타입으로 입력하세요");
			return;
		}
		catch(ArithmeticException e) {
			System.out.println("0은 안되요");
		}
		System.out.println("여기까지합니다.");
	}

	
	public static void main(String[] args) {
		try_01 pe = new try_01();
		pe.exceptionMethod(args); 
	}
}
