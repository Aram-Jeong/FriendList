package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� �Ŵ絿(�ּ�)
	private String memberID;
	private String name;
	private String address;

	// ������: �ʵ忡 �� �ʱ�ȭ
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
		System.out.println("���̵�: " + memberID + " | �̸�: " + name + " | ����ó: " + address);
	}

	public void showMemberId() {
		System.out.println("���̵�: " + memberID);

	}

	public void showName() {
		System.out.println("�̸�: " + name);
	}

	public void showAddress() {
		System.out.println("�ּ�: " + address);
	}
}
