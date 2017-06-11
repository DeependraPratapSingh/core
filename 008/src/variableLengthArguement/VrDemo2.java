package variableLengthArguement;

public class VrDemo2 {
	void fun1(int i,int j){
		System.out.println("fun1(int i,int j)");
		System.out.println();
	}
	void fun1(int ... i){
		System.out.println(i);
		System.out.println("Size :: "+i.length);
		System.out.println("fun1(int ... i)");
		System.out.println();
	}
	/*void fun1(int i[]){
		System.out.println("kkkk");
	}*/
	public static void main(String[] args) {
		VrDemo2 d1 = new VrDemo2();
		d1.fun1(6,8);
		d1.fun1(new int[2]);
		d1.fun1(1,2);
		d1.fun1(3);
		d1.fun1();
	}
}