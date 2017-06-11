/*
 * A method which returns object of the same class by executing private constructor is known as factory method.
 * Every factory method should and must be public
 */

package FactoryMethodPack1;

public class FactoryDemo1 {
	int x;
	
	//private zero arg constructor.
	private FactoryDemo1(){
		System.out.println("Test 0 arg constructor");
	}
	
	//static factory method
	public static FactoryDemo1 CreateStaticInstance(){
		FactoryDemo1 f1 = new FactoryDemo1();
		f1.x=5;
		return f1;
	}
	
	//instance factory method
	public FactoryDemo1 CreateInstance(){
		FactoryDemo1 f2 = new FactoryDemo1();
		f2.x = this.x + 5;
		return f2;
	}
	
	public String toString(){
		return "x="+x;
	}
}