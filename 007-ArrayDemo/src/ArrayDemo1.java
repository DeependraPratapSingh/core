public class ArrayDemo1 {
	public static void main(String[] args) {
//		int x[] = new int[5];
		int[] x = new int[5];
		System.out.println("x :: "+x);//address of object of an array of integer
		System.out.println("length of x[] :: "+x.length);
		System.out.println("x[0] :: "+x[0]);
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			x[i] = i*i;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"]  :: "+x[i]);
		}
		System.out.println("x[x.length-1] :: "+x[x.length-1]);
		
		double y[] = new double[4];
		System.out.println("y :: "+y);
		y[0] = 5.7;
		y[1] = 7.8;
		y[2] = 1.3;
		y[3] = 8.9;
		for (int i = 0; i < y.length; i++) {
			System.out.println("y["+i+"] :: "+y[i]);
		}
		
		float z[] = new float[3];
		System.out.println("z :: "+z);
		
		char ch[] = new char[4];
//		System.out.println("ch :: "+ch);
		System.out.println(ch);
		System.out.println("ch[0] :: "+ch[0]);
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		System.out.println("ch.length :: "+ch.length);
		System.out.println("ch[ch.length-1] :: "+ch[ch.length-1]);
//		System.out.println("ch :: "+ch);
		System.out.println(ch);// we'll see data
	}
}