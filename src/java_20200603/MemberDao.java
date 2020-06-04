package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Member 테이블을 접근하기 위한 클래스
//DAO : Data Access Object 
//Insert into, Update, Delete, Select
public class MemberDao {
	
	public MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// 1. insert()
	public int insert(MemberDto m) {
		int resultCount = 0;

		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) ");
			sql.append("VALUES(?, ?, ?) ");
			pstmt = con.prepareStatement(sql.toString());

			// 바인딩 변수!
			int index = 0;
			pstmt.setInt(++index, m.getNum());
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());

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

	// 2. update()
	public int update(MemberDto m) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME =?, addr =? ");
			sql.append("WHERE num = ?");

			pstmt = con.prepareStatement(sql.toString());
			// ?바인딩변수
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
		}

		return resultCount;
	}

	// 3. delete()
	public int delete(int num) {
		int resultCount = 0;

	
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member WHERE num = ?");

			pstmt = con.prepareStatement(sql.toString());
			// 바인더 변수 설정!
			int index = 0;
			pstmt.setInt(++index, num);

			// SQL문 전송하기!
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

	// 4.select()
	// select로 여러개의 row를 반환할때는 ArrayList로 반환을 하면 되는데
	// select로 하나의 결과값(primaryKey 로 조회)할때는
	public ArrayList<MemberDto> select() {

		ArrayList<MemberDto> list = new ArrayList<MemberDto>();

		

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num DESC ");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				list.add(new MemberDto(num, name, addr));
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

		return list;

	}

	// 5.select(num)
	public MemberDto select(int num) {
		MemberDto mdto = new MemberDto();


		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int index = 0;
				int _num = rs.getInt(++index);
				String _name = rs.getString(++index);
				String _addr = rs.getString(++index);
				mdto = new MemberDto(_num, _name, _addr);
				// 있으면 mdto객체가 반환되고 // 없으면 객체의 default값인 null이 반환된다.

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

		return mdto;
	}
	
	
	

}
