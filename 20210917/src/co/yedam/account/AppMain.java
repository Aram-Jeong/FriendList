package co.yedam.account;

import java.util.Scanner;

public class AppMain {

	// �̱���: new ������ => ���ο� �ν��Ͻ�
	private static AppMain singleton = new AppMain();

	// ������ private
	private AppMain() {

	}
	
	// method getInstance()
	public static AppMain getInstance(){
		return singleton;
	}

	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	

	public void createAccount() {

	
	}

	public void accountList() {
	
	}

	public void deposit() {

	}

	public void withdraw() {

	}


	public static Account findAccount(String ano) {
	
		return null;

	
	}
	

	public void execute() {
		boolean run = true;	
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.println("���� >>");
			int selectNo=scanner.nextInt();
			scanner.nextLine();	
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
	
	
}


