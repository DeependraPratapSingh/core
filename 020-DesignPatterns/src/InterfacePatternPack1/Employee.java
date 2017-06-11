package InterfacePatternPack1;

public class Employee {
	SalaryCalculater sc;
	String name;
	
	public Employee(String name, SalaryCalculater s) {
		this.name = name;
		sc = s;
	}
	
	public void Printsalary(){
		System.out.println("Name :: "+name);
		System.out.println("Salary :: "+sc.getSalary());
	}
}
