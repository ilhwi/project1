package p0220;

abstract class Animal{
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
}

class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	public Cat() {
		kind = "포유루";
	}
	@Override
	public void sound() {
		System.out.println("Mio");
	}
}


public class p01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal = null;
		dog.sound();
		cat.sound();
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		animalsound(new Dog());
		animalsound(new Cat());
	}
	
	public static void animalsound(Animal ani) {
		ani.sound();
		
	}

}
