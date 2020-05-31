package java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "1111-2222";
		
		//charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환(호출)한다.
		
		char c = ssn.charAt(0);
		System.out.println(c);
		
		//concat(String msg) : 문자열 연결.
		ssn = ssn.concat("abcd"); // ssn + "abcd";
		System.out.println(ssn);
		
		String fileName ="abcd.doc";
		//사용예시: 파일확장자에 따라 이미지가 다르게 적용되는 경우, 
		//endsWith(String msg): "msg"로 끝나면 boolean true값 반환 or false값 반환
		if(fileName.endsWith("doc")) {
			System.out.println("Word이미지 삽입()");
		} else if (fileName.endsWith("pdf")) {
			System.out.println("PDF이미지 삽입()");
			
		} else if(fileName.endsWith("png")) {
			System.out.println("png이미지 삽입()");
			
		} else {
			
		}
		//크롤링할 때 많이 사용할 것 같네!!
		//startsWith(String str) : "str"로 시작하면 boolean true값 반환 or flase값 반환
		
		String url = "http://www.google.com";
		String path = "/news/ssss.do?id=123";
		if(path.startsWith("/news")) {
			System.out.println("뉴스페이지 입니다.");
		} else if(path.startsWith("/sports")) {
			System.out.println("스포츠뉴스페이지 입니다.");
			
			
		}
		
		//equalsIgnoreCase(object obj) : 문자열을 비교할 때 객체내용의 대소문자를 무시하고 문자열을 비교한다. True or False;
		//fileName = "abcd.doc"
		boolean success = fileName.equalsIgnoreCase("abcd.DOC");
		System.out.println(success);
		
		
		//indexOf(String str) : str 문자열의 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);
		//문자열에 몇번 인덱스부터 ~ 몇번 인덱쓰까지 호출하고 싶다면, indexOf를 적절하게
		
		
		
		fileName = "abc.abc.abc.abc.doc";
		
		//?lastIndexof(String str) : str 문자열의 마지막 인덱스 위치를 반환! (실행과정: 문자열 마지막에서부터 반대로  찾고, 반환값은 처음부터 카운팅한 인덱스번호이다.)
		System.out.println(fileName.lastIndexOf("."));
		
		
		
		// 배열의 길이: length , 문자열의 길이: length()
		
		
		
		//***** trim() : 문자열의 앞 뒤 공백제거!
		//문자열을 받아오면 앞뒤에 있을 공백을 제거하자 .trim();
		String dbId = "daeyoun".trim();
		String userId = "daeyoun ".trim();
		System.out.println(dbId.length());
		System.out.println(userId.length());
		
		
		
		fileName = "abc.doc";
		
		//first(포함)부터 second(포함하지 않음) 사이의 문자열을 추출!
		//substring(int first): first(포함)보다 큰 인덱스를 추출!
		String first = fileName.substring(0,3); //문자열 슬라이싱과 같은의미!
		String last = fileName.substring(fileName.lastIndexOf("d")); //d부터 끝까지 갖고오고싶을때! 
		
		System.out.println(first);
		System.out.println(last);
		
		fileName = "abcdefghijklmnopqrstuvwxyz";
		//m부터 x까지의 문자열만 출력해보자!! (응용문제)
		System.out.println(fileName.substring(fileName.indexOf("m"), fileName.lastIndexOf("y")));
		
		//응용문제
		//해당 도메인만 추출해보시오
		url = "https://docs.oracle.com/javase/8/docs/api/";
		String urlBasic = url.substring(0,(url.lastIndexOf("j"))-1);
		System.out.println(urlBasic);
		
		
		//replaceAll(String first, String second) : 
		// first문자열 => second문자열로 대체
		String html = "t안녕하세요\nt저는 갤럭시 입니다.\nt잘부탁드립니다.\n";
		html = html.replaceAll("\n", "</br>");
		html = html.replaceAll("t", "<br>");
		System.out.println(html);
		
		//toUpperCase(): 대문자로 변환!
		String m1 = "hello";
		System.out.println(m1.toUpperCase());
		
		//toLowerCase() : 소문자로 변환!
		m1 = "HELLO";
		System.out.println(m1.toLowerCase());
		
		//String.valueOf(~): primitive data type을 "문자열"로 변환!
		
		//char[]의 각각의 문자를 문자열로 합칠 수 있을 때 유용하다!!
		char[] c1 = {'a','b','c'};
		
		String str = String.valueOf(c1);
		System.out.println(str);
		
		//split(String str): str문자열 기준으로 분리할 수 있다.
		String[] str1 = ssn.split("-");
		
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		
		
		String str2 = String.format("%,.2f",123123.4567);
		System.out.println(str2);
		
		
		str2 = String.format("%3$,20.2f%n %1$,20.5f%n %2$,.3f%n", 1234.567, 123345.6780, 1234567.890);
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
