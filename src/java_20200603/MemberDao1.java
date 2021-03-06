package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao1 {
	
	public static int insert(MemberDto dto) {
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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc","kpc12","kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, NAME, addr) ");
			sql.append("VALUES(?, ?, ?) ");
			
			pstmt = con.prepareStatement(sql.toString());
			//바인딩변수
			int index = 0;
			pstmt.setInt(++index, dto.getNum());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getAddr());
			
			resultCount = pstmt.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(con != null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		return resultCount;
	}
	
	
	
	public static ArrayList<MemberDto> select(int start, int end){
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		//jdbc연결
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
			con = DriverManager.getConnection("org.mariadb.jdbc.Driver");
			//sql문 전송
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			
			
			pstmt = con.prepareStatement(sql.toString());
			//바인딩변수 필요없음!
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				list.add(new MemberDto(num, name, addr));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	
	
	

}
