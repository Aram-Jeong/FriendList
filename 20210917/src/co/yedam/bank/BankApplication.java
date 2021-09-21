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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 >>");
			
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
				System.out.println("종료되었습니다.");
			}else {
				System.out.println("잘못된 값을 입력하였습니다.");	
		
			}
			
		}
	}

	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌 생성");
		System.out.println("-------");

		String ano = readStr("계좌번호: ");
		String owner = readStr("계좌주: ");
		int balance = readInt("초기입금액: ");
		Account acc = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acc;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");

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
		System.out.println(" 예 금 ");
		System.out.println("-------");
		
		String ano=readStr("계좌번호: ");
		if(findAccount(ano) !=null) {
			int d=readInt("예금액: ");
			findAccount(ano).setBalance(findAccount(ano).getBalance()+d);
			System.out.println("결과: 예금이 성공되었습니다.");
			
			}
		
		
	}

	private static void withdraw() {
		System.out.println("-------");
		System.out.println(" 출 금 ");
		System.out.println("-------");
		
		String ano=readStr("계좌번호: ");
		if(findAccount(ano) !=null) {
			int w=readInt("출금액: ");
			if(w>findAccount(ano).getBalance()) {
				System.out.println("결과: 출금가능액을 초과하였습니다.");
			}else {
				findAccount(ano).setBalance(findAccount(ano).getBalance()-w);
				System.out.println("결과: 출금이 성공되었습니다.");
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
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");

			}
		}
		return result;

	}
}
