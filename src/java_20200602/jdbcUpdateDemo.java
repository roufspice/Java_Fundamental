package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		//2. Connenction 객체생성: 데이터베이스를 연결
		//localhost : 데이터 베이스 설치 ip
		//3306: 데이터 베이스 포트(mariadb 포트를 3306으로 디폴트 했었음)
		//kpc : 데이터베이스명
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234"); //파라미터:url, user, pw;
			
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성!
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4.바인딩 변수 처리
			int index = 0;
			pstmt.setString(++index, "이명박");
			pstmt.setString(++index, "한국");
			pstmt.setInt(++index, 10);
			
			//5.SQL문 전송
			// resultCount : 업데이트된 행의 수를 반환함.
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("전송결과:" + resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

}
