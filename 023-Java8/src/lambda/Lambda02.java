package lambda;

public class Lambda02 {	
	//Without lambdaExpression
	/*public void m1(){
		System.out.println("Hello");
	}*/
	//With LambdaExpression
	//m1() -> { System.out.println("Hello"); }
	//() -> System.out.println("Hello");
	
	
	
	//WithOut LmbdaExpression
	/*public void add(int a, int b){
		System.out.println(a+b);
	}*/
	//With LambdaExpression
	//add(int a. int b) -> { System.out.println(a+b); }
	//(int a, int b) -> System.out.println(a+b);
	//(a,b) -> System.out.println(a+b);
	
	
	
	//Without LambdaExpression
	/*public int getLength(String s){
		return s.length();
	}*/
	//With LambdaExpression
	//(String s) -> { return s.length(); }
	//(s) -> return s.length();
	//s -> s.length();
}