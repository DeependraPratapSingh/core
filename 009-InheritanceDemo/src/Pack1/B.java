package Pack1;

public class B extends A
{
	int x,y;
	void funB(){
		System.out.println("funB() of B");
	}
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		b1.funB();
		System.out.println(b1.i);
		b1.funA();
	}
}
