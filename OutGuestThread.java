package P0306;

public class OutGuestThread extends Thread{
	private TableExam te;
	
	public OutGuestThread(TableExam te) {
		this.te = te;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			te.outGuest();
			try {
				Thread.sleep((int)(Math.random()*500));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
