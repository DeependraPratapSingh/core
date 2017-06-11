public class Tdemo2 
{
	int i,j;
	Tdemo2(int i)
	{
		i = i+1;
		j = j+1;
		this.i = i+1;
	}
	public static void main(String[] args) {
		Tdemo2 t1 = new Tdemo2(5);
		System.out.println("t1.i :: "+t1.i);
		System.out.println("t1.j :: "+t1.j);
	}
}
