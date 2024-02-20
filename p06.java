package p0220;

interface Animal9{
	void eat();
}

class Dog9 implements Animal9{
	@Override
	public void eat() {
		System.out.println("개걸스럽게 먹는다");
	}
}

class Sigorjabjong extends Dog9{
	@Override
	public void eat() {
		System.out.println("SIGOR EAT.");
	}
}

public class p06 {
	public static void main(String[] args) {
		Sigorjabjong si = new Sigorjabjong();
		Dog9 dog9 = si;
		si.eat(); 
		Animal9 ani = si;

		
		
	}

}
