public class Tdemo3 
{
	int i,j;
	public Tdemo3() {
		this(3);
		System.out.println("inside Tdemo3()");
	}
	Tdemo3(int x){
		this(x,x+1);
		System.out.println("inside Tdemo3(int x)");
	}
	Tdemo3(int x, int y){
		System.out.println("inside Tdemo3(int x, int y)");
	}
	public static void main(String[] args) {
		Tdemo3 t1 = new Tdemo3();
	}
}
