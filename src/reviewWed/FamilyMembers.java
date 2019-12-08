package reviewWed;

public class FamilyMembers {
	public static void main(String[] args) {
		smithMember member1 = new smithMember();
		member1.increment();
		member1.firstName = "John";
		member1.lastName = "Smith";
		member1.gender = 'M';
		member1.salary = 5000;
		member1.memeberInfo();
		System.out.println();

		smithMember member2 = new smithMember();
		member2.increment();
		member2.firstName = "Jane";
		member2.lastName = "Smith";
		member2.gender = 'F';
		member2.salary = 6000;
		member2.memeberInfo();
		System.out.println();

		System.out.println("There are " + member2.count + " members.");
		member1.lastName = "Doe";
		System.out.println("Lastname has changes to Doe.");
		member1.memeberInfo();
		member2.memeberInfo();
		System.out.println();
		System.out.println("Baby is born");

		smithMember baby = new smithMember();
		baby.increment();
		baby.firstName = "Adam";
		baby.gender = 'M';
		baby.salary = 500;
		System.out.println("There are " + baby.count + " members ");
		baby.memeberInfo();
		System.out.println();

		System.out.println("Lets create james family members");

		JamesMember jmember1 = new JamesMember();
		jmember1.increment();
		jmember1.firstName = "Lebron";
		JamesMember.lastName = "James";
		jmember1.gender = 'M';
		jmember1.salary = 1000000;
		
		JamesMember jmember2=new JamesMember();
		jmember2.increment();
		jmember2.firstName="Savannah";
		jmember2.gender='F';
		jmember2.salary=200;

		System.out.println("There are " + jmember1.count + " members.");

	}

}
