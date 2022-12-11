package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection1 {
	public static void main(String[] args) {
		// 데이터베이스와 연동
		// Java에서 데이터베이스를 사용하기 위해서는 해당 SQL(oracle, mySql...)의 라이브러리를 가져와야한다.
		
		DBConn db = new DBConn();
	
	}
}

class DBConn{
	private Connection conn;	// java.sql
	private static final String USERNAME = "root";		// final : 한번 정하면 변경 불가
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";	// 스키마명
	
	// 생성자
	public DBConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// 또는 com.mysql.jdbc.Driver	(5버전)	// 8버전 : cj 추가
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			System.out.println("MySQL 드라이버 로딩 성공");
			selectAll();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("MySQL 드라이버 로딩 실패...");
			try {
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} 
	}
	
	public void selectAll() {
		Statement stmt = null;		// java.sql
		ResultSet rs = null;		// java.sql
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM worker";	// (관례) SQL 문법은 대문자로, 그 외에는 소문자로
			rs = stmt.executeQuery(sql);			// executeQuery() : 쿼리 날리기 (sql작성문 전송)
			while(rs.next()) {
				// 한 행씩 가져온다. 자료형 별로 가져온다
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String gender = rs.getString(3);
				
				System.out.println(id+" "+name+" "+gender);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}