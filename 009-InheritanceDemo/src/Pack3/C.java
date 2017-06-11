package Pack3;

public class C extends B {
	int i,j;
	void funA(){
		System.out.println("funA() of C");
	}
	void funC(){
		i=6;
		super.i=3;
		funA();
		super.funA();
		j=2;
		super.j=5;
		System.out.println("funC() of C");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.funC();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	}
}