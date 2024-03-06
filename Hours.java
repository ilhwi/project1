package texst;

import java.io.IOException;
import java.util.Scanner;

class HorseGame extends Thread{ //쓰레드 상속
	Horse hoursRank = new Horse(); // Horse안에 있는 스태틱 String 쓰기 위하여 객체생성
	String hours; //말들
	private int num; // 말들이 달리는 m

	public HorseGame(String hours) { //쓰레드 생성자
		this.hours = hours;
	}
	
	public void rank() {
		for(int i=1;i<=Horse.hoursRank.length;i++) { // 랭킹 나오게하는 출력문
			if(Horse.hoursRank[i-1] != null) {
			System.out.println(Horse.hoursRank[i-1]+"   "+i+"등");
			}
		}
	}
	public void Game() { //본격 쓰레드 시작
		HorseGame hg = new HorseGame("날돌이");
		HorseGame hg2 = new HorseGame("쌩쌩이");
		HorseGame hg3 = new HorseGame("날씬이");
		HorseGame hg4 = new HorseGame("빵빵이");
		hg.start();
		hg2.start();
		hg3.start();
		hg4.start();
		try {
			hg.join();
			hg2.join();
			hg3.join();
			hg4.join();
		}catch(InterruptedException e) { // 조인을 하지않으면 쓰레드작업이 끝나고 내가원하는 작업이 실행안되고 바로바로 됨
			e.printStackTrace();
		}
	}
	@Override
	public void run() { //쓰레드 오버라이드 해주는거 내입맛대로
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
		System.out.println("얼마 거실껀가요 ?");
		int user_money = scan.nextInt();
		Game();
		rank();
		if(Horse.hoursRank[0].equals(Horse.horseList[user-1])) {
			user_money *= 2;
			System.out.println("=======================");
			System.out.println("= 배팅금액 : "+user_money+"$    =");
			System.out.println("=======================");		
		}
		else {
			System.out.println("==============");
			System.out.println("$$ 돈 날라갔습니다.");
			System.out.println("==============");}
	}
}

public class Horse{
	static String[] hoursRank = new String[10]; // 랭킹시스템 10이지만 null값이 아닌거만 출력됨
	static String[] horseList = new String[] {"날돌이","쌩썡이","날씬이","빵빵이"}; // 내말 리스트 랭킹이랑 비교할려구
	static int rank = 0;
	public static void main(String[] args) {
		HorseGame hg = new HorseGame("시작"); // 객체생성을 위해 햇음
		hg.GameStart();

	}
}
