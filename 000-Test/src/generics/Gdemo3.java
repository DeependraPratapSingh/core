package generics;

public class Gdemo3<k, v> {
	k g1;
	v g2;

	void fun1(k i, v j) {
		this.g1 = i;
		this.g2 = j;
	}

	k getK() {
		return g1;
	}

	v getV() {
		return g2;
	}

	public static void main(String[] args) {
		Gdemo3<String, Integer> g1 = new Gdemo3<String, Integer>();
		g1.fun1("deependra", 2000);
		String str = g1.getK();
		System.out.println("Str :: " + str);
		int i = g1.getV();
		System.out.println("Int :: " + i);
	}
}