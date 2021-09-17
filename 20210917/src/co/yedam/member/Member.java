package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구 중구 신당동(주소)
	private String memberID;
	private String name;
	private String address;

	// 생성자: 필드에 값 초기화
	public Member() {

	}

	public Member(String mId) {
		memberID = mId;
	}

	public Member(String mId, String n, String a) {
		memberID = mId;
		name = n;
		address = a;
	}

	public void setMemberId(String mId) {
		memberID = mId;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberID;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

	public void showInfo() {
		System.out.println("아이디: " + memberID + " | 이름: " + name + " | 연락처: " + address);
	}

	public void showMemberId() {
		System.out.println("아이디: " + memberID);

	}

	public void showName() {
		System.out.println("이름: " + name);
	}

	public void showAddress() {
		System.out.println("주소: " + address);
	}
}
