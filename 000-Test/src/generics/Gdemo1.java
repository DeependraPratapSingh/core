//generics is the concept of defining a variable without knowing the datatype at the time of designing a program.
//whenever it is requires that the end user will have to mention the datatype of the vaiable what we define in our program then we apply the concept of generics.
//We mention the datatype of collection only by using generics.

package generics;
import threadEx1.DeamonThread1;

public class Gdemo1<T>
{
	T x;
	public static void main(String[] args) {
		Gdemo1<DeamonThread1> d1 = new Gdemo1<DeamonThread1>();
		d1.x = new DeamonThread1();
		System.out.println("d1.x :: "+d1.x);
//		d1.x.run();
		
		Gdemo1<Integer> d2 = new Gdemo1<Integer>();
		d2.x = 200;
		System.out.println("d2.x :: "+d2.x);
		d2.x = d2.x + 10;
		System.out.println("d2.x+10 :: "+d2.x);
		
		Gdemo1<String> d3 = new Gdemo1<String>();
		d3.x = "Deependra";
		System.out.println("d3.x :: "+d3.x);
		
	}
}