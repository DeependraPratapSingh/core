package InterfacePatternPack1;

public class Test1 {
	public static void main(String[] args) {
		SalaryCalculater s = new CategotyA(2000, 300);
		Employee e = new Employee("Deependra",s);
		e.Printsalary();
		System.out.println("-----------------");
		
		s = new CategoryB(3000, 500);
		e = new Employee("Dp", s);
		e.Printsalary();
		System.out.println("-----------------");
		
		s = new CategotyA(3000, 500);
		e = new Employee("Singh", s);
		e.Printsalary();
	}
}
