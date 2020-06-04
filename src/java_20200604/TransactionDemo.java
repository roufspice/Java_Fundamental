package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isSuccess = false;
		Connection con = null;
		// 변수를 두개 선언했네.?
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");

			// 트랜잭션 시작!! : 오토커밋이 자동으로 작동되지 못하게 하려면 setAutoCommit(false)로 지정해야 한다.
			//**기본값이 true로 설정이 되어있다. 기본적으로 JSP는 오토커밋(AutoCommit)이다. commit이 자동으로 수행된다.
			//트랜잭션(Transaction)을 처리할 때는 오토커밋이 일어나서 자동으로 commit을 사용하면 안 된다.
			//여러 개의 쿼리 문장이 하나의 작업으로 수행되어야 하기 때문에 JSP의 오토커밋이 자동으로 작동되지 못하게 해야한다.

			con.setAutoCommit(false);

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(100,'A4','B4')");

			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
			

			// StringBuffer 비우기
			sql.setLength(0);

			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(110,'A5','B5')");

			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			isSuccess = false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (isSuccess) {
					con.commit();	//트랜잭션의 commit을 수행한다.
				} else {
					con.rollback();	//트랜잭션의 rollback을 수행한다.
				}
				con.setAutoCommit(true);	//오토커밋을 다시 true로 변경한다.
				if (pstmt2 != null)
					pstmt2.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
