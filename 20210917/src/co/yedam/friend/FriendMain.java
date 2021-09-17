package co.yedam.friend;

import java.util.Scanner;

/*
 *  친구목록관리
 *  이름, 연락처, 이메일, 키, 몸무게
 *  등록, 조회(이름), 목록, 수정, 삭제, 종료.
 */

public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] myFriend = new Friend[50];
		myFriend[0] = new Friend("신짱구", "111-2222", "son@nnn.com", 130, 18);
		myFriend[1] = new Friend("봉미선", "333-4444", "mom@nnn.com", 165, 57);
		myFriend[2] = new Friend("신형만", "555-6666", "dad@nnn.com", 176, 71);

		while (true) {
			System.out.println("[1]등록 [2]조회 [3]목록 [4]수정 [5]삭제 [6]종료");
			int menu = readInt("====================메뉴를 선택하세요====================");

			if (menu == 1) {
				System.out.println("친구 등록 메뉴입니다.");
				String name = readStr("친구의 이름을 입력하세요.");
				String phone = readStr("친구의 연락처를 입력하세요");
				String email = readStr("친구의 이메일 주소를 입력하세요.");
				int height = readInt("친구의 키를 입력하세요.");
				int weight = readInt("친구의 몸무게를 입력하세요.");
				Friend clsrn = new Friend(name, phone, email, height, weight);
				for (int i = 0; i < myFriend.length; i++) {
					if (myFriend[i] == null)
						myFriend[i] = clsrn;
					break;
				}System.out.println("저장 완료");
			}else if(menu==2) {
				System.out.println("친구 조회 목록입니다.");
				String search=readStr("조회할 친구의 이름을 입력하세요");
				for(Friend clsrn:myFriend) {
					if(clsrn !=null && clsrn.getName().indexOf(search) != -1)
						clsrn.showInfo();
		}
		
		
			
		}else if(menu==3) {
			System.out.println("친구 목록 메뉴입니다.");
			for(Friend clsrn:myFriend) {
				if(clsrn != null)
					clsrn.showInfo();
			}
		}else if(menu==4) {
			System.out.println("친구 수정 메뉴입니다.");
			String search = readStr("수정할 친구의 이름을 입력하세요.");
			String name=readStr("새로운 이름 입력[해당없음-엔터]");
			String phone=readStr("변경할 연락처 입력[해당없음-엔터]");
			String email=readStr("변경할 이메일 입력[해당없음-엔터]");
			String height=readStr("변경할 키 입력[해당없음-엔터]");
			String weight=readStr("변경할 몸무게 입력[해당없음-엔터]");
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
				System.out.println("정상적으로 수정 완료!");
			else
				System.out.println("존재하지 않는 이름입니다.");
		}else if(menu==5) {
			System.out.println("친구 삭제 메뉴입니다.");
			String search=readStr("삭제할 친구명을 입력하세요.");
			for(int i=0; i<myFriend.length; i++) {
				if(myFriend[i] !=null && myFriend[i].getName().indexOf(search) != -1)
					myFriend[i]=null;
			}
			System.out.println("삭제 완료");
		}else if(menu==6) {
			System.out.println("종료되었습니다.");
			break;
		}else {
			System.out.println("없는 메뉴입니다.");
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
				System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요.");

			}
		}
		return result;
	}

}
