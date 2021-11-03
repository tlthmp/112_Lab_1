/*  TO DO:
	*  Add your name here!
	*
	*/


public class Driver {
	

	
		public static void main (String[] args){
			// Creates a Committee and assigns the Committee name
			Committee commit = new Committee("Barbarians");

			// Adds people to the Committee
			commit.addMember("Dan Jones", 32, "Male");
			commit.addMember("Susan Tate", 35, "Female");
			commit.addMember("Brenda Abbott", 32, "Female");
			commit.addMember("John Mason", 29, "Male");
			commit.addMember("Michael Ward", 40, "Male");
			commit.addMember("Taylor Ismer", 45, "Female");
			commit.addMember("Nathan Umbridge", 50, "Male");

			// Prints the Committee name
			commit.printName();

			// Prints all the Committee members: name, age, and gender
			commit.printMembers();
		}
	}

