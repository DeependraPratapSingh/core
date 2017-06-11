class Odemo14 
{
	A getA(int i)
	{
		A a1 = new A();
		a1.i = i;
		a1.j = i+1;
		return(a1);
	}
	public static void main(String[] args) 
	{
		Odemo14 d1 = new Odemo14();
		A a1 = d1.getA(3);
		System.out.println(a1.i);
		System.out.println(a1.j);
		d1.getA(2);
		System.out.println(d1.getA(2));
		System.out.println();
		int i = d1.getA(4).i;
		System.out.println(i);
		int j = d1.getA(4).i+2;
		System.out.println(j);
		d1.getA(5).funA();
	}
}
