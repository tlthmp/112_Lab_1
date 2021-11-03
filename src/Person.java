
public class Person {
	
private String Name;
private int Age;
private String Gender;
 public Person(){
	 Name = "";
	 Age = 0;
 }
 public Person (String n, int age, String gender){
	 Name = n;
	 this.Age = age;
	 this.Gender = gender;
 }
 public void setName (String n){
	 Name = n;
 }
 public void setAge (int age){
	 Age = age;
 }
 public void setGender (String gender){
	 Gender = gender;
 }
 public String getName(){
	 return Name;
 }
 public int getAge(){
	 return Age;
 }
 public String getGender(){
	 return Gender;
 }
}
