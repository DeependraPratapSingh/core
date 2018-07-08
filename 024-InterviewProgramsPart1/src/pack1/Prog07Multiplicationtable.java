package pack1;

public class Prog07Multiplicationtable {

	public static void main(String[] args) {
		int x=5;
		int table = 1;
		
		for (int i = 1; i <= 10; i++) {
			table = x * i;
			System.out.println(table);
		}
	}

}
