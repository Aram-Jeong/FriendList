package co.yedam.bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);
	static int num = 0;
	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("���� >>");
			
			int selectNo=scn.nextInt();
			
			scn.nextLine();
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
				System.out.println("����Ǿ����ϴ�.");
			}else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");	
		
			}
			
		}
	}

	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���� ����");
		System.out.println("-------");

		String ano = readStr("���¹�ȣ: ");
		String owner = readStr("������: ");
		int balance = readInt("�ʱ��Աݾ�: ");
		Account acc = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("���: ���°� �����Ǿ����ϴ�.");

	}

	private static void accountList() {
		for (Account acc : accountArray) {
			if (acc != null) {
				System.out.println(acc.getOwner()+" | "+acc.getAno());
			}
		}
		
	}

	private static void deposit() {
		System.out.println("-------");
		System.out.println(" �� �� ");
		System.out.println("-------");
		
		String ano=readStr("���¹�ȣ: ");
		if(findAccount(ano) !=null) {
			int d=readInt("���ݾ�: ");
			findAccount(ano).setBalance(findAccount(ano).getBalance()+d);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
			
			}
		
		
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println(" �� �� ");
		System.out.println("-------");
		
		String ano=readStr("���¹�ȣ: ");
		if(findAccount(ano) !=null) {
			int w=readInt("��ݾ�: ");
			if(w>findAccount(ano).getBalance()) {
				System.out.println("���: ��ݰ��ɾ��� �ʰ��Ͽ����ϴ�.");
			}else {
				findAccount(ano).setBalance(findAccount(ano).getBalance()-w);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		}
			
			

	}

	private static Account findAccount(String ano) {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				break;
			}
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
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
