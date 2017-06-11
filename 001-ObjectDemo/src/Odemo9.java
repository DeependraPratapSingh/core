class Odemo9 
{
	int x;
	A a1 = new A();
	//Odemo9 d2 = new Odemo9();     java.lang.StackOverflowError
	Odemo9 d1;
	public static void main(String[] args) 
	{
		Odemo9 d1 = new Odemo9();
		System.out.println("from main() :: "+d1.x);
	}
}
