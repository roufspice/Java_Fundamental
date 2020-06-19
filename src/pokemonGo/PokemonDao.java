package pokemonGo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PokemonDao {
	
	public static int insert(PokemonDto dto) {
		int resultCount =0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터베이스와 연결을 시도한다.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12","kpc1234");
			//3.  sql문을 전송할 PreparedStatement 생성
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO pokemon(p_num, p_name, p_attr) ");
			sql.append("VALUES(?, ?, ?) 						   ");
			
			
			pstmt = con.prepareStatement(sql.toString());
			
			// 4바인딩 변수설정
			int index = 0;
			pstmt.setInt(++index, dto.getNum());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getAttr());
			
			resultCount = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt!= null)pstmt.close();
					if(con!= null) con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return resultCount;
	}
	
	public static int update(PokemonDto dto) {
		int resultCount =0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//데이터베이스와 연결하고! -> sql문을 전송한다.
			con = DriverManager.getConnection("jdbc:mysql//localhost:3306/kpc","kpc12","kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE pokemon 	   				  ");
			sql.append("SET p_name =?, p_attr =?  ");
			sql.append("WHERE p_num = ? 					");
			
			pstmt = con.prepareStatement(sql.toString());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultCount;
		
	}
	
	public static int delete(PokemonDto dto) {
		int resultCount=0;
		return resultCount;
		
		
	}

}
