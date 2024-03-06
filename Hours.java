package texst;

import java.io.IOException;
import java.util.Scanner;

class HoursGame extends Thread{
	Horse hoursRank = new Horse();
	String hours;
	private int num;

	public HoursGame(String hours) {
		this.hours = hours;
	}
	
	public void rank() {
		for(int i=1;i<=Horse.hoursRank.length;i++) {
			if(Horse.hoursRank[i-1] != null) {
			System.out.println(Horse.hoursRank[i-1]+"   "+i+"등");
			}
		}
	}
	public void Game() {
		HoursGame hg = new HoursGame("날돌이");
		HoursGame hg2 = new HoursGame("쌩쌩이");
		HoursGame hg3 = new HoursGame("날씬이");
		HoursGame hg4 = new HoursGame("빵빵이");
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
	@Override
	public void run() {
		for(int i=0; i<1200; i++) {
			num++;
			if(num%200==0 || num%400==0 || num%800==0) {
				System.out.println(hours+"말 "+num);
			}if(num==1200) {
				Horse.hoursRank[Horse.rank] = this.hours;
				Horse.rank++;
			}
		}
	}
	public void GameStart() {
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("-  경마 월드 게임장  -");
		System.out.println("------------------");
		System.out.println("1 날돌이, 2. 썡쌩이, 3. 날씬이 4. 빵빵이");
		System.out.print("1등할 말을 골라주세요 >>");
		int user = scan.nextInt();
		Game();
		rank();
		if(Horse.hoursRank[0].equals(Horse.horseList[user]))
			System.out.println("1등 맞췄습니다.");
		else {
			System.out.println("==============");
			System.out.println("$$ 돈 날라갔습니다.");
			System.out.println("==============");}
	}
}

public class Horse{
	static String[] hoursRank = new String[10];
	static String[] horseList = new String[] {"날돌이","쌩썡이","날씬이","빵빵이"};
	static int rank = 0;
	public static void main(String[] args) {
		HoursGame hg = new HoursGame("시작");
		hg.GameStart();

	}
}
