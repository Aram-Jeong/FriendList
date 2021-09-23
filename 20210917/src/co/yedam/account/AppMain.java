package co.yedam.account;

import java.util.Scanner;

public class AppMain {

	// 싱글톤: new 생성자 => 새로운 인스턴스
	private static AppMain singleton = new AppMain();

	// 생성자 private
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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 >>");
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
			System.out.println("종료되었습니다.");
		}else {
			System.out.println("잘못된 값을 입력하였습니다.");	
	
		}
	}
	
}
	
	
}


