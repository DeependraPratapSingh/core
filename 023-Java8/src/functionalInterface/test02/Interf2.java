package functionalInterface.test02;

@FunctionalInterface
public interface Interf2 extends Interf
{
	//In child interface,we can define exactly same parent interface abstract method
	public abstract void m1();
	
	//In child interface we can not define any new abstract method
	//public abstract void m2();
}