package co.yedam;

public class Member {
	// 필드(정보저장)
	int memberID;
	String name;
	String phone;
	
	// 메소드(기능)
	public void showInfo() {
		System.out.println("아이디: "+memberID+", 이름: "+name+", 연락처: "+phone);
	}
}
