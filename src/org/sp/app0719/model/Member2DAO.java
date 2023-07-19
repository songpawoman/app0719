package org.sp.app0719.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//오직  Member2 테이블에 대한 CRUD 를 처리하는 DAO 객체 
public class Member2DAO {
	String url="jdbc:mysql://localhost:3306/javase?characterEncoding=utf8";
	String user="root";
	String password="1234";
	
	//레코드 1건 등록 
	public void insert(Member2 member2) {
		Connection con=null;//접속 성공 후, 그 정보를 가진 객체 따라서
									//접속을 해제할때 이 객체를 이용할 수 있다..
		PreparedStatement pstmt=null; //쿼리수행 객체 
		
		try {
			//드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			
			//접속
			con=DriverManager.getConnection(url, user, password);
			if(con==null) {
				System.out.println("접속실패");
			}else {
				System.out.println("접속성공");
				
				String sql="insert into member2(id, pass, name, email)";
				sql+=" values('"+member2.getId()+"','"+member2.getPass()+"','"+member2.getName()+"','"+member2.getEmail()+"')";
				
				System.out.println(sql);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	//모든 레코드 가져오기 
	public void selectAll() {
	}
	
	//1건 수정 
	public void update() {
		
	}
	
	//1건 삭제 
	public void delete() {
		
	}
}









