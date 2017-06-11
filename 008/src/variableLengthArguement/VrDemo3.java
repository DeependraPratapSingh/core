package variableLengthArguement;

public class VrDemo3 {
	void fun1(int ... i){
		System.out.println("fun1(int ... i)");
		System.out.println();
	}
	void fun1(String ... i){
		System.out.println(i);
		for(String x:i){
			System.out.println(x);
		}
		System.out.println("fun1(String ... i)");
		System.out.println();
	}
	public static void main(String[] args) {
		VrDemo3 d1 = new VrDemo3();
		d1.fun1(2,3,4);
		d1.fun1("aaa","bbb");
//		d1.fun1();//ambiguous
//		d1.fun1(null);//ambiguous
	}
}