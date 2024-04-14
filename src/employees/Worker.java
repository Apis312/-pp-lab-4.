package employees;

public class Worker extends Employee {

	
	
	public String position;
	
	public void setPosition(String x) {
		position = x;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		//Podobnie jak w Manager zamieniono getFullName na get name 
		return("Worker: " + getName()+"\nSalary:" + getSalary() + "\nPosition: " + getPosition());
	}
	public  Worker(String x) {
		setPosition(x);
	}
	
}
