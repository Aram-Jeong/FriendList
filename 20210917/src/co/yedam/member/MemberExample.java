package co.yedam.member;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸 �߱� ���ϵ�"); // ������ ȣ��
		m1.showInfo();
		
		m1.setMemberId("user1");
//		m1.name="Hong";
		m1.setName("Hong");
//		m1.address="�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");
//		System.out.println("���̵�: "+m1.memberID);
		System.out.println("���̵�: "+m1.getMemberId());
//		System.out.println("�̸�: "+m1.name);
		System.out.println("�̸�: "+m1.getName());
//		System.out.println("�ּ�: "+m1.address);
		System.out.println("�ּ�: "+m1.getAddress());

		Member m2 = new Member("user2","���ƶ�","�뱸 ���� ��굿");
		m2.showInfo();
		m2.setMemberId("user2");
		m2.setName("���ƶ�");
		m2.setAddress("�뱸 ���� ��굿");
				System.out.println("���̵�: "+m2.getMemberId());	
				System.out.println("�̸�: "+m2.getName());
				System.out.println("�ּ�: "+m2.getAddress());

		Member m3 = new Member("user3", "ȫ�浿", "�뱸 ���� �Ŵ絿");
		m3.showInfo();
//		m3.name="�ڱ浿";
		m3.setName("�ڱ浿");
		m3.showInfo();
//		m1.memberID = "user1";
//		m1.name = "Hong";
//		m1.address = "�߱� ���ϵ�";

	}

}
