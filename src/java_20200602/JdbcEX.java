package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;	
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEX {
	public static void main(String[] args) {
		//1.드라이브 LOAD
		//Driver 객체를 메모르에 로드하여 Java Application과 mariadb-java-client- xxx.jar
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. Connection 객체 생성: 데이터베이스 연결하기!
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp2 (empno,ename,deptno) VALUES(?,?,?)");
			pstmt = con.prepareStatement(sql.toString());
			
		//4. 바인딩 변수 설정
			int index = 0;
			pstmt.setInt(++index, 1004);
			pstmt.setString(++index,"YONG");
			pstmt.setInt(++index, 10);
			
			
			
		//5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("업데이트 된 row: " + resultCount);
			
			
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
