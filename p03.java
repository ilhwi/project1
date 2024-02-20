package p0220;

class Vehicle{
	void move() {
		System.out.println("탑승한다.");
	}
}

interface Flyable{
	void fly();
}

class WonderKidy extends Vehicle implements Flyable{
	@Override
	public void fly(){
		System.out.println("날아가~");
	}
}
public class p03 {
	public static void main(String[] args) {
		WonderKidy won = new WonderKidy();
		won.move();
		won.fly();
		
	}

}
