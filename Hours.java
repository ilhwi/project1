package P0306;

import java.io.IOException;

class HoursGame extends Thread{
	Hours hoursRank = new Hours();
	String hours;
	int rank = 0;
	int num;

	public HoursGame(String hours) {
		this.hours = hours;
	}
	@Override
	public void run() {
		for(int i=0; i<1200; i++) {
			num++;
			if(num%200==0 || num%400==0 || num%800==0) {
				System.out.println(hours+"말"+num);
			}if(num==1200) {
				hoursRank.hoursRank[hoursRank.rank] = this.hours;
				hoursRank.rank++;
			}
		}
	}
	public void rank() {
		for(int i=1;i<=hoursRank.hoursRank.length;i++) {
			System.out.println(hoursRank.hoursRank[i-1]+"           "+i+"등");
		}
	}
	public void Game() {
		HoursGame hg = new HoursGame("hours1");
		HoursGame hg2 = new HoursGame("hours2");
		HoursGame hg3 = new HoursGame("hours3");
		HoursGame hg4 = new HoursGame("hours4");
		
		hg.start();
		hg2.start();
		hg3.start();
		hg4.start();
		try {
			hg.join();
			hg2.join();
			hg3.join();
			hg4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Hours{
	static String[] hoursRank = new String[4];
	static int rank = 0;
	public static void main(String[] args) {
		HoursGame hg = new HoursGame("시작");
		hg.Game();
		hg.rank();

	}
}
