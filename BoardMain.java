package P0227_01;
import java.util.Scanner;
public class BoardMain {
	public static void main(String[] args) {
		
		boolean stop = false;
		Scanner sc =new Scanner(System.in);
		BoardSVC boardSvc = new BoardSVC();
		do {
			System.out.println("===============");
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.게시판 글쓰기");
			System.out.println("2. 게시판 글 목록보기");
			System.out.println("3. 게시글 삭제하기");
			System.out.println("4. 종료");
			System.out.print("메뉴번호 입력 :");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				boardSvc.writeArticle(sc);
				break;
			case 2:
				boardSvc.listArticles(sc);
				break;
			case 3:
				boardSvc.removeArticles(sc); //비밀번호 알게되면
				break;
			case 4:
				stop = true;
			}
		}while(!stop);
	}
}
