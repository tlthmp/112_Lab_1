

public class Committee {
	
private String CName;
private Person [] per = new Person [15];
private int count = 0;

	
public Committee (String name) {
		CName = name;

	}



public void addMember(String name, int age, String gender) {
	
	per [count] = new Person (name, age, gender);
	count++;
}
public void printMembers() {
	for (int i = 0; i < count; i++){
			System.out.println("Members are: " + per[i].getName() + ". Their age is: " + per[i].getAge() + " ,and their gender is: " + per[i].getGender() );
	}
	
}



public void printName() {
	System.out.println("Commitee name is: " + CName );
	System.out.println();
	for (int i = 0; i < count; i++){
		System.out.println("Name: " + per[i].getName() + ". Age: " +per[i].getAge() );
	}
	
}

}