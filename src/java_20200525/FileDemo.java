package java_20200525;

import java.io.File; //File클래스는 java.io
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		/* File 클래스
		 * 1. 디렉토리 생성(v)
		 * 2. 파일크기(v)
		 * 3. 파일이름 
		 * 4. 파일경로
		 * 5. 수정한날짜(milliseconds)
		 * 6. 파일생성, 삭제(v), 이름바꾸기(v)		 * 
		 */
		// 파일 생성자: 경로를 문자열로 쭈욱정리한다.
		File f1 = new File("c:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if (success) {
			System.out.println("디렉토리를 생성했습니다.");
		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}

		File f2 = new File("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024;
		System.out.printf("%,dKB%n", fileSize);

		// 파일이름이 필요할 때: getName()
		String fileName = f2.getName();
		System.out.println(fileName);

		// 전체경로가 필요할 때 : getPath()
		String path = f2.getPath();
		System.out.println(path);

		if (fileName.endsWith("exe")) {
			System.out.println("응용프로그램");
		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일");
		} else {
			System.out.println("파일 폴더");
		}

		// 1970년 1월1일부터 마지막 수정한 날짜까지의 시간을 밀리세컨드로 반환한 값!
		long lastModified = f2.lastModified();
		// 1.
		System.out.println(lastModified);

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String date = sdf.format(cal.getTime());
		// 2.
		System.out.println(date);

		File f3 = new File("C:\\dev\\Hello.java");
		
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//f3.delete();
		File f4 = new File("C:\\dev\\HelloWorld.java");
		
		f3.renameTo(f4);
		
		
		
		
		
		
		

	}

}
