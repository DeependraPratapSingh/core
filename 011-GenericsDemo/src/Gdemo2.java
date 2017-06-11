public class Gdemo2<T> 
{
	T t1;
	void fun1(T g1){
		this.t1=g1;
	}
	T fun2(){
		return t1;
	}
	public static void main(String[] args) {
		Gdemo2<String> g1 = new Gdemo2<String>();
		System.out.println(g1.t1);
		g1.fun1("abcd");
		String a = g1.fun2();
		System.out.println(a);
		System.out.println("Size :"+a.length());
		
		Gdemo2<Integer> g2 = new Gdemo2<Integer>();
		System.out.println(g2.t1);
		g2.fun1(1312);
		int b = g2.fun2();
		System.out.println("b :"+b);
	}
}