package InterfacePatternPack1;

public class CategotyA implements SalaryCalculater
{
	
	double BasicSalary;
	double Bonus;
	public CategotyA(float bsal, float bons) {
		BasicSalary = bsal;
		Bonus = bons;
	}
	
	public double getSalary(){
		double sal = (BasicSalary + Bonus);
		return sal;
	}
}
