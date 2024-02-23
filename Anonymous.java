package P09;
class Worker{
	public void start() {
		System.out.println("쉬고 있습니다.");
	}
}
class Anony{
	Worker fiedld = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인 합니다.");
		}
	};
	void methode1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	void methode2(Worker worker) {
		worker.start();
	}
	
}
public class Anonymous {
	public static void main(String[] args) {
		Anony anony = new Anony();
		anony.fiedld.start();
		anony.methode1();
		anony.methode2(new Worker() {
			public void start() {
				System.out.println("테스트를 합니다.");
			};
		});
	}
}
