package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao1 {

	// ****1. insert()메소드
	public int insert(MemberDto m) {
		int resultCount = 0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) ");
			sql.append("VALUES(?, ?, ?) ");
			// sql문을 전송할 수 있는 객체 생성!
			pstmt = con.prepareStatement(sql.toString());

			// 바인딩 변수 설정!
			int index = 0;
			pstmt.setInt(++index, m.getNum());
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());

			// SQL전송해야죠!
			resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// resultCount == 1: 아니면 -1
		return resultCount;
	}
	// 2. update()

	public int update(MemberDto m) {
		int resultCount = 0;
		String dbUrl = "jdbc:mysql://localhost/kpc";
		String user = "kpc12";
		String pw = "kpc1234";
		// 드라이브 불러오기 - 데이터베이스 연결시도 - sql -바인드 변수 설정- sql전송 - 닫아주고
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// db url, user, pw
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(dbUrl, user, pw);
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member SET NAME =?, addr =? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());
			pstmt.setInt(++index, m.getNum());

			resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return resultCount;
		}

	}
	// delete()
	public int delete(int num) {
		int resultCount = 0;
		String dbUrl = "jdbc:mysql://localhost/kpc";
		String user = "kpc12";
		String pw = "kpc1234";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(dbUrl, user, pw);
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(1, num);
			resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return resultCount;
		

	}
	
	//select select로 여러개의 row를 반화할 때는  ArrayList로 반환을 하면 되는데, select로 하나의 결과값만 
	
	public ArrayList<MemberDto> select() {
		
		String dbUrl = "jdbc:mysql://localhost/kpc";
		String user = "kpc12";
		String pw = "kpc1234";
		
		ArrayList<MemberDto> mdto = new ArrayList<MemberDto>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(dbUrl, user, pw);
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("order BY num DESC ");
			
			pstmt = con.prepareStatement(sql.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	

}
