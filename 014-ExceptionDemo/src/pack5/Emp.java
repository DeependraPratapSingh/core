package pack5;

public class Emp 
{
	public float getpension(int age, float bsal) throws InvalidAgeException 
	{
		float pen = 0;
		if(age >100 || age<60){
			throw new InvalidAgeException();
		}
		pen = (age * bsal)/100;
		return pen;
	}

	public static void main(String[] args) 
	{
		int age = Integer.parseInt(args[0].trim());
		float bsal = Float.parseFloat(args[1].trim());
		Emp e1 = new Emp();
		try {
			float pen = e1.getpension(age,bsal);
			System.out.println("pension :: "+pen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}