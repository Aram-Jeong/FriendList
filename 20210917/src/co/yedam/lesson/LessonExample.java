package co.yedam.lesson;

/*
 *  실행클래스 + 라이브러리용 클래스 여러 개=> 프로그램 구성.
 *  객체구성(학생, 선생님, 반) => 객체지향언어
 *  학생(객체) -> 학생(클래스)
 *  김소영 -> new 학생(): 인스턴스
 */ 	

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("홍길동", "국사");

		Student s1 = new Student("김소영 | ", "010-1111 | ", "대구 중구");
		Student s2 = new Student("정혜윤 | ", "010-2222 | ", "대구 서구");
		
		// 선생님 - 학생1, 학생2, 학생3...
		Lesson l1=new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3-1");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		
		Teacher t2 = l1.getTeacher();
		System.out.println("선생님 이름: "+t2.getName());
		System.out.println("선생님 과목: "+l1.getTeacher().getMajor());
		
		l1.showStudents();
	}
}
