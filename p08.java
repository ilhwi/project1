package p0220;

class OuterClass2{
	
	private int outVar = 30;
	private static int staticOutVar = 40;
	
	void printInfo() {
		int localVar = 9;
		final int finalLocal = 55;
		class InnerClass2{
			void displayInfo() {
				System.out.println(outVar);
				System.out.println(staticOutVar);
				System.out.println(localVar);
				System.out.println(finalLocal);
			}
		}
		InnerClass2 ic = new InnerClass2();
		ic.displayInfo();
	}
}

public class p08 {
	public static void main(String[] args) {
		OuterClass2 ou = new OuterClass2();
		ou.printInfo();
	}
}
