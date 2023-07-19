package org.sp.app0719.model;

//오직  Member2 테이블에 대한 CRUD 를 처리하는 DAO 객체 
public class Member2DAO {
	//레코드 1건 등록 
	public void insert(String id, String pass, String name, String email) {
		String sql="insert into member2(id, pass, name, email)";
		sql+=" values('"+변수+"','"+변수+"','"+변수+"','"+변수+"')";
		
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









