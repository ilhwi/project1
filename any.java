package P09;
interface Vehicle{
	public void run();
}

class anym{
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	void method1() {
		Vehicle local = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		local.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
public class any {
	public static void main(String[] args) {
		anym an = new anym();
		an.field.run();
		an.method1();
		an.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}
