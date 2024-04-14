package employees;

public class Manager extends Employee {

	public int numberOfSubordinates;
	
	public void setNumberOfSubordinates(int x) {
		numberOfSubordinates = x;
	}
	
	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}
	
	public String toString() {
		
		//W zadaniu pierwszym w klasie po której dziedziczymy robiliśmy metodę getName - w zadaniu drugim 
		//Pojawia się getFFullName. -- Zamieniono na getName
		return("Manager " + getName() + "\nSalary: "+ getSalary()+"\nSubordinates: " + numberOfSubordinates   );
	}
	
	public Manager(int x) {
		setNumberOfSubordinates(x);
	}
}
