
public class BB extends AA {
	public static void m1(){
		System.out.println("child class");
	}
	public static void main(String[] args) {
		AA a=new BB();
		a.m1();
	}

}
