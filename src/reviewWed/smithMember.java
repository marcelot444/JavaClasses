package reviewWed;

public class smithMember {
	String firstName;
	static String lastName;
	char gender;
	int salary;
	static int count;
	static int monthlyIncome;
	
	public void increment() {
		count++;
	}
	public void memeberInfo() {
		System.out.println(firstName+" "+ lastName+" makes $"+salary+" monthly");
	}

}
