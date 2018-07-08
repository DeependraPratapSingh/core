package functionalInterface.test01;

@FunctionalInterface
public interface Interf {
	public abstract void m1();

	//Functional Interface can have only one abstract method
	//public abstract void m4();
	
	//Functional Interface can have any number of default method
	default void m2() {
		System.out.println("Hello2 form m2()");
	}

	//Functional Interface can have any number of static method
	public static void m3() {
		System.out.println("Hello3 from m3()");
	}
}