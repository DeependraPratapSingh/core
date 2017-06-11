package pack1;

/**
 * @author DnzDP
 *
 */
public class X implements Xyz
{
	public void fun1(){
		System.out.println("from fun1() of class X");
	}
	public void fun2(){
		System.out.println("from fun2()  of class X");
	}
	public void fun3(){
		System.out.println("from fun3() of class X");
	}
	public static void main(String[] args) {
		Xyz x1 = new X();
		x1.fun1();
		x1.fun2();
//		x1.fun3();
	}
}
