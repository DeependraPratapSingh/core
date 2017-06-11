package FactoryMethodPack1;

public class FactoryTest1 
{
	public static void main(String[] args) 
	{
		FactoryDemo1 f3 = FactoryDemo1.CreateStaticInstance();
		System.out.println(f3);
		FactoryDemo1 f4 = f3.CreateInstance();
		System.out.println(f4);
	}
}