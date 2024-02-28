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
	
	public void UserWriteArticle(Scanner sc,UserSVC usersvc) {
		System.out.println("회원입니다.");
		System.out.println("이메일 : ");
		String email = sc.next();
		System.out.println("제목 :");
		String subject = sc.next();
		System.out.println("글작성 : ");
		String content = sc.next();
		
		BoardVO boardVo = new BoardVO(usersvc.getId(), subject, email,content,usersvc.getPasswd());
		boardList.add(boardVo);
	}
	
	public void writeNotUser(Scanner sc) {
		System.out.println("비회원입니다.");
		writeArticle(sc);
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
			System.out.println("삭제할 아이디를 선택 해주세요"); 
			String choice = sc.next(); // 
			//for(int i=0;i<boardList.size();i++) {
			for(int i= boardList.size()-1;i>=0;i--) {
				if (boardList.get(i).getRegister().equals(choice)){
					System.out.print(choice+"에 비밀번호를 입력해주세요");
					String passwd = sc.next();
					if(boardList.get(i).getPasswd().equals(passwd)) {
						System.out.println("삭제되었습니다.");
						boardList.remove(i); //삭제하는 위치
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						return;
					}
				}
			}
			System.out.println("찾으시는 게시판 제목이 없습니다. ㅡ.ㅡ");
			
		}else {
			System.out.println("게시판이 비어있습니다.");
		}
	}
	
	public void 수정Aticle(Scanner sc) {
		if(boardList.size()>0) {
			System.out.println("수정할 제목을 선택해주세요"); 
			String choice = sc.next(); // 제목을 입력해주세요 
			//for(int i=0;i<boardList.size();i++) {
			for(int i= boardList.size()-1;i>=0;i--) {
				if (boardList.get(i).getSubject().equals(choice)){
					System.out.print(choice +"에 비밀번호를 입력해주세요");
					String passwd = sc.next();
					if(boardList.get(i).getPasswd().equals(passwd)) {
						System.out.println("수정할 글 제목을 입력해주세요");
						String subject = sc.next();
						boardList.get(i).setSubject(subject);
						System.out.println("수정되었습니다.");
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
						return;
					}
				}
			}
		}else {
			System.out.println("게시판이 비어있습니다.");
		}
	}
	
//	public void removeArticles(Scanner sc) {
//		System.out.println("제거할 글의 작성자와 비밀번호를 입력해주세요");
//		System.out.println("작성자 : ");
//		String register = sc.next();
//		System.out.println("비밀번호 : ");
//		String passwd = sc.next();
//		removeArticles(register, passwd);
//		
//	}
//	
//	private void removeArticles(String register, String passwd) {
//	if(boardList.size()>0) {
//		int index = -1;
//		for(int i= 0; i<boardList.size();i++) {
//			if(boardList.get(i).getRegister().equals(register)){
//				if(boardList.get(i).getPasswd().equals(passwd)) {
//					boardList.remove(i)
//				}
//			}
//		}
//	}
//	else {
//		System.out.println("작성된 게시글이 없습니다.");
//	}
//	
//}

	public void search(Scanner sc) {
		System.out.println("제목을 선택하여주세요");
		String subject = sc.next();
		System.out.println("검색할 단어");
		String sentence = sc.next();
		if(subject != null) {
			for(int i=0; i<boardList.size();i++) {
				if(boardList.get(i).getSubject().equals(subject)) {
					int 위치 = boardList.get(i).getContent().indexOf(sentence);
					System.out.println(위치 + "째에 있습니다.");
					return;
				}
			}
		}
		 
	}
}
