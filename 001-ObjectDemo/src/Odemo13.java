class Odemo13 
{
	int getsqr(int x)
	{
		int sq = x*x;
		return(sq);
	}
	public static void main(String[] args) 
	{
		Odemo13 d1 = new Odemo13();
		int x = d1.getsqr(3);
		System.out.println("sqr :: "+x);//9
		d1.getsqr(2);
		System.out.println(d1.getsqr(4));//16
		int i = d1.getsqr(5)+1;
		System.out.println("i :: "+i);//26
		System.out.println(d1.getsqr(6)+1);//37
	}
}
