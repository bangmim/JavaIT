package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn2 {
	public static void main(String[] args) {
//	데이터베이스 라이브러리 추가하기
//	프로젝트 우클릭 -> Properties -> Java Build Path -> Classpath -> Add External JARs...-> mysql-connector-j-8.0.xx.jar 
//	MySQL 설치 경로 : C:\\Program Files (x86)\\MySQL\\Connector J 8.0
		
		MyDB2 db = new MyDB2();
		
//		db.connect();
//		db.insert();
		
//		db.connect();
//		db.update();
		
//		db.connect();
//		db.delete();
		
		db.connect();
		db.select();
	}
}

class MyDB2{
	private Connection conn;
	private static final String USERNAME = "root";	
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";	

	// 생성자가 아닌 static에서 실행 할 수도 있다
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM worker";	// sql 쿼리
		
		try {	
			pstmt = conn.prepareStatement(sql);	// createStatement()
			rs = pstmt.executeQuery(); 			// excuteQuery(sql)
			
			while(rs.next()) {	
				int id = rs.getInt(1);	
				String name = rs.getString(2);	
				String gender = rs.getString(3);	
				
				System.out.println(id + " "+ name+" "+gender+" ");	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	
			try {
				pstmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert() {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO worker (name, gender) VALUES (?,?)";	// 변경되는 값을 ? 로 표시한다.
		
		try {
			pstmt = conn.prepareStatement(sql);	
			// ? 에 핸당하는 값을 채워준다 (pstmt는 뒤는게 ?를 채워줘도 된다)
			pstmt.setString(1, "pink");	// 첫번째 ?에 문자열을 넣음
			pstmt.setString(2, "man");	// 두번째 ?에 문자열을 넣음
				
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("입력 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		PreparedStatement pstmt = null;
		String sql = "UPDATE worker SET gender=? WHERE id=?";

		try {
			pstmt = conn.prepareStatement(sql);	
			// ? 채워주기
			pstmt.setString(1, "woman");
			pstmt.setInt(2, 1);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("수정 성공!");
			}else {
				System.out.println("수정 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM worker WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setInt(1, 10);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
