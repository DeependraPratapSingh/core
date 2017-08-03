package pack6;

public class EmpSal {

	public float getpension(int age, int bsal) throws InvalidAgeException
	{
		float pen = 0;
		if (age<60 || age>100) {
			throw new InvalidAgeException();
		}
		pen = (age * bsal)/100;
		return pen;
	}
	
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0].trim());
		int bsal = Integer.parseInt(args[1].trim());
		EmpSal e1 = new EmpSal();
		try {
			float pen = e1.getpension(age, bsal);
			System.out.println("Pension :"+pen);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Age :"+age);
		System.out.println("Basic Salary:"+bsal);
	}
}