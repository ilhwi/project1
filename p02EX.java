package p0220;

class InterImpl implements p02{
	@Override
	public void interMethod() {
		System.out.println("interface method");
	}
}






public class p02EX{
	public static void main(String[] args) {
		InterImpl inter = new InterImpl();
		inter.interMethod();
		System.out.println(inter.interVal);
	}
}
