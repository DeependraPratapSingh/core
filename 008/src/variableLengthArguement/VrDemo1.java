package variableLengthArguement;

public class VrDemo1 {
	void fun1(int ... i){
		System.out.println("i :: "+i);
		System.out.println("size :: "+i.length);
		for(int x:i){
			System.out.println("x[] :: "+x);
		}
	}
	public static void main(String[] args) {
		VrDemo1 d1 = new VrDemo1();
		int ar[] = {6,7,8,9};
		d1.fun1(ar);
//		d1.fun1(6,7,8,9,10);
	}
}
