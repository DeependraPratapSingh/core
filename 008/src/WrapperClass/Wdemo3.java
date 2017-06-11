package WrapperClass;

public class Wdemo3 {
	void getSI(double d,float f,int i){
		double si = (d*f*i)/100;
		System.out.println("si :: "+si);
		double ta = d + si;
		System.out.println("Total Amount :: "+ta);
	}
	
	public static void main(String[] args) {
		double d = Double.parseDouble(args[0]);
		float f = Float.parseFloat(args[1]);
		int i = Integer.parseInt(args[2]);
		Wdemo3 w1 = new Wdemo3();
		w1.getSI(d,f,i);
	}
}
