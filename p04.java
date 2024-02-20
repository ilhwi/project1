package p0220;

interface Plant{
	void eat();
}

interface FlyHell extends Plant{
	void melt();
}

class ABC implements FlyHell{
	public void melt() {
		System.out.println("소화시킨다");
	}
	public void eat() {
		System.out.println("먹는다");
	}
}

public class p04 {
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.eat();
		FlyHell fh = abc;
		Plant pl = abc;
		fh.eat();
		abc.melt();
	}
}
