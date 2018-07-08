// WAP to print natural numbers from 1 to 100 using two Threads.
// where one thread prints only odd numbers and other thread prints only even numbers.
package Prog16NaturalNumbersUsing2Thread;

public class Test {
	public static Object obj =  new Object();
	public static void main(String[] args) {
		PrintEvenNum pen = new PrintEvenNum(obj);
		PrintOddNum pon = new PrintOddNum(obj);
		
		Thread t1 = new Thread(pen);
		Thread t2 = new Thread(pon);
		t1.start();
		t2.start();
	}
}