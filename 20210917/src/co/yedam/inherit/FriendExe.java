package co.yedam.inherit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends; // �ʵ忡�� ����

	private FriendExe() { // ������ ȣ��
		// ģ��, �б�ģ��, ȸ��ģ�� => �迭�� ����
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("���ڹ�", "010-1234-5678");
		friends[5] = new Friend("���ڹ�", "010-1234-5555"); // ��������
		friends[1] = new Friend("ȫ�ڹ�", "010-1111-2222");
		friends[2] = new Friend("�ڹμ�", "010-1111-5678"); // ""
		friends[3] = new UnivFriend("�ڼ���", "010-1234-2222", "���а�");
		friends[4] = new CompFriend("��ö��", "010-2222-5678", "������");
	}

	public static FriendExe getInstance() { // �̰ɷθ� ȣ���� �� �ֵ��� ������ private
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("-----------------------------------------");
			System.out.println("1. ��� | 2. ��ȸ | 3. ���� | 4. ���� | 5. ����");
			System.out.println("-----------------------------------------");
//		ScanUtil su = new ScanUtil(); ->�ν��Ͻ� �޸� �Ҵ�
//		su.readInt(null);
			int menu = ScanUtil.readInt("�޴��� �����ϼ���."); // staticŸ�� �����߱� ������ �̷��� �ٷ� ����

			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				delete();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("��.");

	}

	private void addFriend() {
		// ģ��, �б�ģ��(+����), ȸ��ģ��(+�μ�)
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴� ���� >>");
		String name = ScanUtil.readStr("�̸� �Է�");
		String phone = ScanUtil.readStr("����ó �Է�");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("���� �Է�");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ� �Է�");
			friend = new CompFriend(name, phone, depart);

		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;

			}
		}
		System.out.println("��� ����");
	}

	private void showList() {
		// �̸�, ����ó �Է� => ȫ�浿, ��浿 -> "�浿"
		// 1111-1211, 2222-1211 -> "1211"
		// �浿, 1211 -> �̸� & ����ó
		System.out.println("ģ����ȸ �޴��Դϴ�.");
		String name = ScanUtil.readStr("��ȸ�� ģ���� �̸��� �Է��ϼ���."); // ""
		String phone = ScanUtil.readStr("��ȸ�� ����ó�� �Է��ϼ���."); // ""
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (!name.equals("") && !phone.equals("")) {
					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
						System.out.println(friends[i].toString());
					}
				} else if (!phone.equals("")) {
					if (friends[i].getPhone().indexOf(phone) != -1) {
						System.out.println(friends[i].toString());
					}
				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1) {
						System.out.println(friends[i].toString());
					}
				} else { // ����, ���� = ��ȸ�� ������ ���� => ��ü ��ȸ
					System.out.println(friends[i].toString());
				}
			}
		}
	}

	private void modify() {
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");
		String phone = ScanUtil.readStr("������ ����ó�� �Է��ϼ���.");
		if (!phone.equals(""))
			friends[num].setPhone(phone);
		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("������ ������ �Է��ϼ���");
			if (!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);
		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("������ �μ��� �Է��ϼ���");
			if (!depart.equals(""))
				((CompFriend) friends[num]).setDepart(depart);

		}
		System.out.println("�����Ϸ�");
	}

	private void delete() {
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");

		if (friends[num] != null) {
			friends[num] = null;
			System.out.println("���� �Ϸ�.");

		} else {
			System.out.println("������ ������ �����ϴ�.");
		}
	}
}
