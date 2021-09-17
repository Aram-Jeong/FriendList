package co.yedam.friend;

public class Friend {
	private String name;
	private String phone;
	private String email;
	private int height;
	private int weight;

	public Friend() {

	}

	public Friend(String name, String phone, String email, int height, int weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void showInfo() {
		System.out.printf("* 이름: %s \n* 연락처: %s\n* 이메일: %s\n* 키: %d\n* 몸무게: %d\n--------\n", name,phone,email,height,weight);
	}

}
