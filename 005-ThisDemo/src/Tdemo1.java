public class Tdemo1 
{
	int i,j;
	void funT(int i)
	{
		i = i+1;
		j = i+1;
//		Tdemo1 t1 = new Tdemo1();
//		t1.i = i+1;
		this.i = i+1;
		System.out.println("this :: "+this);
	}
	public static void main(String[] args) {
		Tdemo1 t1 = new Tdemo1();
		System.out.println("t1 :: "+t1);
		t1.funT(3);
		System.out.println("t1.j :: "+t1.j);
		System.out.println("t1.i :: "+t1.i);
//		System.out.println("this.i :: "+this.i);//can not use this inside main method
	}
}
