package p0220;
//class ObjectProcess{
//	public void process(Object obj) {
//		System.out.println("Object: "+ obj.toString());
//	}
//}

interface ObjectProcess{
	void process(Object obj);
}

public class p10 {
	public static void main(String[] args) {
//		ObjectProcess obj = new ObjectProcess();
		ObjectProcess obj1 = new ObjectProcess() {
			@Override public void process(Object obj) {
				System.out.println("process Object "+obj.toString());
			}
		};
		obj1.process("hello");
		obj1.process(123);
		obj1.process((new java.util.Date()));
		
	}

}
