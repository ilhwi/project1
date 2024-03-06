package P0306;

public class TableExam {
	private static int MAX_TABLE = 5;
	int guestNum = 0;
	
	public synchronized  void inGuset() {
		System.out.println("손님이 들어옴");
		guestNum ++;
		System.out.println("현재"+ guestNum + "테이블 입니다.");
		if(guestNum== MAX_TABLE) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void outGuest() {
		if(guestNum < 1) {
			notify();
			return;
		}
		System.out.println("손님이 나감");
		guestNum--;
		System.out.println("현재 손님은 "+ guestNum+" 테이블 입니다. ");
	}
	
	public static void main(String[] args) {
		TableExam te = new TableExam();
		InGuestThread it = new InGuestThread(te);
		OutGuestThread ot = new OutGuestThread(te);
		
		it.start();
		ot.start();
	}
}
