package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconn1 {
	public static void main(String[] args) {
//		데이터베이스 라이브러리 추가하기
//		프로젝트 우클릭 -> Properties -> Java Build Path -> Classpath -> Add External JARs...-> mysql-connector-j-8.0.xx.jar 
//		MySQL 설치 경로 : C:\\Program Files (x86)\\MySQL\\Connector J 8.0

		MyDB1 db = new MyDB1();
		
//		db.connect();
//		db.insert();

//		db.connect();
//		db.update();
		
		db.connect();
		db.delete();

		db.connect();
		db.select();
		
		

	}
}

// MySQL Workbench 실행
class MyDB1{
	private Connection conn;
	// 연결
	private static final String USERNAME = "root";	// static : 전역변수 // final : 한번 정하면 바꿀 수 없음
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc.mysql://localhost:3306/company";	// 스키마명 (테이블명X)

	// DB라이브러리 실행
	public MyDB1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// MySQL 8버전 (5버전이면 cj. 을 뺀다)
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
	
	// CRUD : Create, Read, Update, Delete - 추가하고, 읽고, 수정하고, 삭제한다
	// insert, select, update, delete 사용
	
	// # : select를 제외한 insert, update, delete는 구조를 그대로 사용하고, 쿼리만 변경하면 된다.
	public void select() {
		// try-catch 구문 사용을 위해 미리 null 로 선언해둔다
		Statement stmt = null;
		ResultSet rs = null;
		
		try {	// 오류 발생 방지 위해 try 블록 안에 코드 작성한다
			stmt = conn.createStatement();	// sql 문장을 작성하겠다
			String sql = "SELECT * FROM worker";	// select All
			rs = stmt.executeQuery(sql); // 해당 문장을 실행하겠다
			
			while(rs.next()) {	// 위에서부터 한 행씩 반복문
				// 변수에 값을 담는다
				int id = rs.getInt(1);	// 첫번째 열의 값을 가져와 변수에 담는다
				String name = rs.getString(2);	// 두번째 열의 값을 가져와 변수에 담는다
				String gender = rs.getString(3);	// 세번째 열의 값을 가져와 변수에 담는다
				
				System.out.println(id + " "+ name+" "+gender+" ");	// 한 행씩 실행할 때마다 출력
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	// close 하지 않으면 프로그램이 점점 느려지다가 죽게된다. 마무리 꼭!
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insert() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();	
			String sql = "INSERT INTO worker (name, gender) VALUES ('orange','man')";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("입력 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void update() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();	
			String sql = "UPDATE worker SET gender='woman' WHERE id='6'";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("수정 성공!");
			}else {
				System.out.println("수정 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();	
			String sql = "DELETE FROM worker WHERE id='8'";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패 ...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}