package p0220;

class OuterClass{
	private int outerVar = 10;
	private static int outerStaticVar =20;
	static class InnerClass{
		public void printInfo() {
			//System.out.println("outerVar :"+outerVar);
			System.out.println("outerStaticVar :"+outerStaticVar);
		}
	}
}
public class p07 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		OuterClass.InnerClass ic1 = new OuterClass.InnerClass();
		ic.printInfo();
		
		
	}
}
