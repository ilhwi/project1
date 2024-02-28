package P0227_01;
import java.util.Scanner;
public class BoardMain {

	public static void main(String[] args) {	
		
		boolean stop = false;
		Scanner sc =new Scanner(System.in);
		BoardSVC boardSvc = new BoardSVC();
		UserSVC usersvc = new UserSVC();
		
		do {
			System.out.println("===============");
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 게시판 글쓰기"); // ->회원인가요 ? 비회원인가요 체크
			System.out.println("3. 게시판 글 목록보기");
			System.out.println("4. 게시글 수정하기");
			System.out.println("5. 게시글 삭제하기");
			System.out.println("6. 종료");	
			System.out.print("메뉴번호 입력 :");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				usersvc.registerUser();
				break;
			case 2:
				System.out.println("1. 회원 , 2. 비회원");
				int userChoice = sc.nextInt();
				if(userChoice == 1 ) {
					if(usersvc.Login()) {
						boardSvc.UserWriteArticle(sc, usersvc);
					}
				}else if(userChoice == 2) {
					System.out.println("비회원입니다.");
					boardSvc.writeArticle(sc);
				}
				break;
			case 3:
				boardSvc.listArticles(sc);
				break;
			case 4: //수정
				boardSvc.수정Aticle(sc);
				break;
			case 5:
				boardSvc.removeArticles(sc); //비밀번호 알게되면
				break;
			case 6:
				stop = true;
			}
		}while(!stop);
	}
}


