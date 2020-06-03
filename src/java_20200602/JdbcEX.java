package java_20200602;

public class JdbcEX {
	public static void main(String[] args) {
		//1. 드라이브 LOAD
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		//2. 데이버베이스와 연결을 시도한다.
		//3. sql문을 전송할 수 있는 PreparedStatement 객체를 생성
		//4.  
		
		
}
}
