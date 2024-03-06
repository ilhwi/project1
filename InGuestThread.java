package P0306;

import java.util.Random;

public class InGuestThread extends Thread{
	
	private TableExam te;
	
	public InGuestThread(TableExam te) {
		this.te = te;
	}
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			te.inGuset();
			try {
				Thread.sleep((int)(Math.random()*500));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

