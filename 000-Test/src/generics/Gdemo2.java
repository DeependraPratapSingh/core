package generics;

public class Gdemo2<T> 
{
	T g1;
	void fun1(T g1){
		this.g1 = g1;
	}
	T fun2(){
		return g1;
	}
	public static void main(String[] args) {
		Gdemo2<String> d1 = new Gdemo2<String>();
		System.out.println("d1.g1"+d1.g1);
		d1.fun1("deependra");
		String str = d1.fun2();
		System.out.println("str :: "+str);
	}
}