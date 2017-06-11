package pack3;

public class Edemo3 {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0].trim());
		int j = Integer.parseInt(args[1].trim());
		int k = Integer.parseInt(args[2].trim());
		int l = Integer.parseInt(args[3].trim());
		A a1 = null;

		try {
			int x = i / j;// arithmatic exception
			x = x + 1;
			System.out.println("x : " + x);

			if (x > 5)
				a1 = new A();
			a1.funA();// Null Pointer Exception

			int ar[] = new int[k];
			ar[l] = x;// ArrayIndex out of bond exception

		}
		catch (ArrayIndexOutOfBoundsException e3) {
			e3.printStackTrace();
		}
		catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch (NullPointerException e2) {
			e2.printStackTrace();
		}
	}
}