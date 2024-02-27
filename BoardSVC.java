package P0227_01;
import java.util.ArrayList;
import java.util.Scanner;


public class BoardSVC {
	ArrayList<BoardVO> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();		
	}
	
	public void writeArticle(Scanner sc) {
		System.out.println("게시판 글을 작성하세요.");
		System.out.println("작성자 : ");
		String register = sc.next();
		System.out.println("이메일 : ");
		String email = sc.next();		
		System.out.println("비밀번호 : ");
		String passwd = sc.next();
		System.out.println("제목 : ");
		String subject = sc.next();
		System.out.println("글작성 : ");
		String content = sc.next();
		
		BoardVO boardVo = new BoardVO(register,subject,email,content,passwd);
		boardList.add(boardVo);
	}
	public void listArticles(Scanner sc) {
		if(boardList.size()>0) {
			for(int i=0;i<boardList.size();i++) {
				System.out.println(boardList.get(i));
			}
		}else {
			System.out.println("작성된 글이 없습니다.");
		}
	}
	public void removeArticles(Scanner sc) {
		if(boardList.size()>0) {
			System.out.println("삭제할 게시판을 제목을 선택 해주세요"); 
			Object choice = sc.next(); // 
			boolean found = false;
			for(int i=0;i<boardList.size();i++) {
				if (boardList.get(i).getSubject().equals(choice)){
					System.out.print(choice+"에 비밀번호를 입력해주세요");
					Object passwd = sc.next();
					if(boardList.get(i).getPasswd().equals(passwd)) {
						System.out.println("삭제되었습니다.");
						return;
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						return;
					}
				}
			}
			System.out.println("찾으시는 게시판 제목이 없습니다. ㅡ.ㅡ");
			removeArticles(sc);
			
		}else {
			System.out.println("게시판이 비어있습니다.");
		}
	}
}
