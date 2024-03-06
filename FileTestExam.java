package P0306;
import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;


public class FileTestExam {
	public static class ImageNameFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(".log");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("C: 드라이브의 전체파일 출력");
		File file = new File("c:\\windows");
		String[] files = file.list();
		for(String fileName:files) {
			File subFile = new File(file, fileName);
			System.out.println("파일이름 :"+ fileName+",  크기"+subFile.length()+"byte ,경로 : "+subFile.getAbsolutePath());
		}
		
		System.out.println("img 파일");
		String[] imgFiles = file.list(new ImageNameFilter());
		for(String imgfileName:imgFiles) {
			File subFile = new File(file, imgfileName);
			System.out.println("파일이름 :"+ imgfileName+",  크기"+subFile.length()+"byte ,경로 : "+subFile.getAbsolutePath());
		}
		File makeFile = new File("c:\\data\\testFile.txt");
		try {
			makeFile.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}if(makeFile.exists()) {
			System.out.println("makeFile이 생성됨");
		}
		
		File rename = new File("c:\\data\\testFile2.txt");
		makeFile.renameTo(rename);
		
		if(rename.delete()){
			System.out.println("rename 파일이 삭제됨");
		}
		
	}
}
