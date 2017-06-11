package InterfacePatternPack1;

public class CategoryB implements SalaryCalculater
{
	public float BasicSalary;
	public float Bonus;
	public float extra = 200;
	public CategoryB(float bsal, float bons) {
		BasicSalary = bsal;
		Bonus = bons;
	}
	
	public double getSalary(){
		float salary = (BasicSalary + Bonus +extra);
		return salary;
	}
}
