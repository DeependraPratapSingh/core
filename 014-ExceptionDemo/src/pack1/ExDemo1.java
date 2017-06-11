package pack1;

public class ExDemo1 {
	int sum;
	int div;

	// A a1 = new A; //Syntex Error
	// B b1 = new B(); //Compilation error ,because class B is existing at the
	// time of compilation
	void funEx() {
		// Thread.sleep(100); Compilation Error because of checked exception
		for (int i = 0; i <= 50; i++) {
			sum = sum + i;
		}
		System.out.println("sum of 50 num :: " + sum);
	}

	void funDiv(int x, int y) {
		try {
			div = x / y;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("division of " + x + " and " + y + " is " + div);
	}

	public static void main(String[] args) {
		ExDemo1 e1 = new ExDemo1();
		e1.funEx();
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		e1.funDiv(x, y);
		System.out.println("After funDiv()");
	}
}