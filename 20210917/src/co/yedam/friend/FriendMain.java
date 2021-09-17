package co.yedam.friend;

import java.util.Scanner;

/*
 *  ģ����ϰ���
 *  �̸�, ����ó, �̸���, Ű, ������
 *  ���, ��ȸ(�̸�), ���, ����, ����, ����.
 */

public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] myFriend = new Friend[50];
		myFriend[0] = new Friend("��¯��", "111-2222", "son@nnn.com", 130, 18);
		myFriend[1] = new Friend("���̼�", "333-4444", "mom@nnn.com", 165, 57);
		myFriend[2] = new Friend("������", "555-6666", "dad@nnn.com", 176, 71);

		while (true) {
			System.out.println("[1]��� [2]��ȸ [3]��� [4]���� [5]���� [6]����");
			int menu = readInt("====================�޴��� �����ϼ���====================");

			if (menu == 1) {
				System.out.println("ģ�� ��� �޴��Դϴ�.");
				String name = readStr("ģ���� �̸��� �Է��ϼ���.");
				String phone = readStr("ģ���� ����ó�� �Է��ϼ���");
				String email = readStr("ģ���� �̸��� �ּҸ� �Է��ϼ���.");
				int height = readInt("ģ���� Ű�� �Է��ϼ���.");
				int weight = readInt("ģ���� �����Ը� �Է��ϼ���.");
				Friend clsrn = new Friend(name, phone, email, height, weight);
				for (int i = 0; i < myFriend.length; i++) {
					if (myFriend[i] == null)
						myFriend[i] = clsrn;
					break;
				}System.out.println("���� �Ϸ�");
			}else if(menu==2) {
				System.out.println("ģ�� ��ȸ ����Դϴ�.");
				String search=readStr("��ȸ�� ģ���� �̸��� �Է��ϼ���");
				for(Friend clsrn:myFriend) {
					if(clsrn !=null && clsrn.getName().indexOf(search) != -1)
						clsrn.showInfo();
		}
		
		
			
		}else if(menu==3) {
			System.out.println("ģ�� ��� �޴��Դϴ�.");
			for(Friend clsrn:myFriend) {
				if(clsrn != null)
					clsrn.showInfo();
			}
		}else if(menu==4) {
			System.out.println("ģ�� ���� �޴��Դϴ�.");
			String search = readStr("������ ģ���� �̸��� �Է��ϼ���.");
			String name=readStr("���ο� �̸� �Է�[�ش����-����]");
			String phone=readStr("������ ����ó �Է�[�ش����-����]");
			String email=readStr("������ �̸��� �Է�[�ش����-����]");
			String height=readStr("������ Ű �Է�[�ش����-����]");
			String weight=readStr("������ ������ �Է�[�ش����-����]");
			boolean isExist=false;
			for(int i=0; i<myFriend.length; i++) {
				if(myFriend[i] !=null && myFriend[i].getName().equals(search)) {
					if(!phone.equals("")) {
						myFriend[i].setPhone(phone);
					}
					if(!email.equals("")) {
						myFriend[i].setEmail(email);
				}
					if(!height.equals("")) {
						myFriend[i].setHeight(Integer.parseInt(height));
			}
					if(!weight.equals("")) {
						myFriend[i].setWeight(Integer.parseInt(weight));
		}
					isExist=true;
	}
			}
			if(isExist)
				System.out.println("���������� ���� �Ϸ�!");
			else
				System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}else if(menu==5) {
			System.out.println("ģ�� ���� �޴��Դϴ�.");
			String search=readStr("������ ģ������ �Է��ϼ���.");
			for(int i=0; i<myFriend.length; i++) {
				if(myFriend[i] !=null && myFriend[i].getName().indexOf(search) != -1)
					myFriend[i]=null;
			}
			System.out.println("���� �Ϸ�");
		}else if(menu==6) {
			System.out.println("����Ǿ����ϴ�.");
			break;
		}else {
			System.out.println("���� �޴��Դϴ�.");
		}
		}
	}
		
		
	

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;

			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");

			}
		}
		return result;
	}

}
