package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEX {
	public static void main(String[] args) {
		//1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 완료!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. 데이터베이스 연결시도하기 : connection 객체 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체 생성!!
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) VALUES(?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩변수 처리
			int index = 0;
			pstmt.setInt(++index, 4);
			pstmt.setString(++index, "DAE");
			pstmt.setString(++index, "UAE");
			
			//5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(con!=null) con.close();
					if(pstmt!=null) pstmt.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		}
		
		

	}

}
