package pack2;

public class Edemo2 {
	public static void main(String[] args) {
		int x = 0;
		int i = Integer.parseInt(args[0].trim());
		int j = Integer.parseInt(args[1].trim());
		try {
			x = i / j;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("x : " + x);
		x = x + 1;
		System.out.println("x : " + x);
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}
}
