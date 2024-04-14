package warsz_lab4;
import java.util.Scanner;

public class Employee {
	
	Scanner scan = new Scanner(System.in);

	private String fullName;
	private double salary;
	
	public String getName() {
		return fullName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double x) {
		salary = x;
	}
	
	public String toString() {
		return ( "Employee: " +fullName + "\nSalary: " + salary   );
	}
	
	// W instrukcji nic o tym nie ma ale żeby dało się ustawić pole fullName dodano set
	public void setName(String n) {
		fullName = n;
	}
	
	Employee(){
		System.out.println("Konstruktor Podaj imie i pensje");
		String n = scan.next();
		double s = scan.nextDouble();
		setName(n);
		setSalary(s);
	}
	
	
}
