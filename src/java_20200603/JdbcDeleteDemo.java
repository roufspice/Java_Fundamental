package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/kpc";
		String user = "kpc12";
		String pin = "kpc1234";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		// 2. 데이터베이스와 연결한다.
		try {
			con = DriverManager.getConnection(url, user, pin); //사용하는 데이테베이스명을 포함한 url, user, pw

			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 전송한다.
			// SQL문이 필요하니까 StringBuffer로 먼저 sql문을 만들어준다.
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE 	");
			sql.append("FROM member ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			// pstmt: sql문을 전송할 변수!
			// 4. 바인딩 변수를 설정!
			pstmt.setInt(1, 10);

			// 5.SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수: " + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
