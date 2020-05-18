package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		
		// 유니코드로 내 이름 찾기 => '\u0000' 
		char c1 = '\uD558';
		char c2 = '\uB300';
		char c3 = '\uC724';
		
	
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		// 아스키코드 	
		// 48 - 57 => 0-9
		// 65 - 90 => A-Z
		// 97 - 122 => a-z
		
		char c4 = 97;
		System.out.println(c4);
		
		char c5 = '배';
		System.out.println(c5);

		
		char c6 = '\'';			// 홑따옴표를 표시하고 싶다면 앞에 \를 붙인다.
		char c7 = '\\';			// \(역슬래쉬)를 표시하고 싶다면 앞에 \를 붙여준다.
		char c8 = '"'; 			// "(쌍따옴표)는 표시된다.
		
		String s1 = "'";	
		String s2 = "\"";
		String s3 = "\\";
		
		System.out.println("aaa" + '\t' + "bbb");	// \t : Tab
		System.out.println("aaa" + '\n' + "bbb");	// \n : Line feed
		System.out.println("aaa" + '\r' + "bbb"); 	// \r : Carriage Return(리눅스 계열의 'Enter')
		
		
		
		
		
	}

}
