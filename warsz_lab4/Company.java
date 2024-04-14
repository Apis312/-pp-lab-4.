package warsz_lab4;



//klasa z metodą main
public class Company {

	public static void main(String[] args) {
		
		Employee[] Employees = new Employee[5];  //Tablica obiektów na 5 miejsc
		int g = Employees.length;
		
		for(int i = 0; i < g; i++) {
		
		Employees[i] = new Employee();
		}
		
		
		System.out.println( "\nDane z metody toString dla indeksu 3\n" + Employees[3].toString());
		
		//modyfikowanie salary pod indeksem 3 
		Employees[3].setSalary(12345);
		
	
		for(int i = 0; i < g; i++) {
			
			System.out.println( "\nDane z metody toString dla indeksu "+ i+ "\n" + Employees[i].toString());
			}
	
	
	
	
	}}
