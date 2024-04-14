
import employees.Employee;
import employees.Worker;
import employees.Manager;

//klasa z metodą main
public class Company {

	public static void main(String[] args) {
		
		Employee[] Employees = new Employee[7];  //Tablica obiektów na 5 miejsc
		int g = Employees.length;
		
		for(int i = 0; i < g; i++) {
			
			// podmiana na 7 pozycji i 2 menagerow
		if(i == 0) {
			Employees[i] = new Manager(0);
		} else if(i == 1 || i == 4 || i == 6) {
			String z1 = ("Posada" + i );
			Employees[i] = new Worker(z1);
		}else if(i == 5 ) {Employees[i] = new Manager(0);}
		else {Employees[i] = new Employee();}
		}
		
		
		System.out.println( "\nDane z metody toString dla indeksu 3\n" + Employees[3].toString());
		
		//modyfikowanie salary pod indeksem 3 


		
	//Zmiany przed wyświetlaniem
	int pracownicy = 0;
	for(int i = 0; i<g; i++) {
		 if( Employees[i] instanceof Manager) {} else {pracownicy++;}
	}
	
	
	//Ustawianie pól dla managerów
	for(int i = 0; i < g; i++) {
		if( Employees[i] instanceof Manager) {
			Employees[i].setSalary(7500);
			Employees[i].setNumberOfSubordinates(pracownicy);
		}
	}
	
	//Zwiekszanie pensji wszystkim pracownikom nie bedacych menagerem
	double tymczas;
	for(int i = 0; i < g; i++) {
		if( Employees[i] instanceof Manager) {} else {
			tymczas = Employees[i].getSalary() + 500;
			Employees[i].setSalary(tymczas);}}


		for(int i = 0; i < g; i++) {
			
			System.out.println( "\nDane z metody toString dla indeksu "+ i+ "\n" + Employees[i].toString());
			}
	
	
	
	
	}}