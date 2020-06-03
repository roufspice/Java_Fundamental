package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
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
		// Connection, PreparedStatement, ResultSet 모두 인터페이스!
		Connection con = null;
		PreparedStatement pstmt = null;
		// SQL문의 결과 집합을 관리하는 인터페이스!
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, pin); // getConnection(String url, String user, String
																// password)
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num desc ");

			pstmt = con.prepareStatement(sql.toString());
			// select문을 사용할 경우에는 ' executeQuery()' 사용해야 한다.
			// insert, update, delete, 사용할경우에는 'executeUpdate()'
			rs = pstmt.executeQuery(); // PreparedStatment 인테페이스에 추상메소드인 executeQuery()의 리턴값이 ResultSet 인터페이스라는 의미.
			// :Query실행 시작! .next()메소드 :다음행으로 커서를 이동(다음행이 있으면 true, 없으면 false)
			while (rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				System.out.printf("%d, %s, %s %n", num, name, addr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
