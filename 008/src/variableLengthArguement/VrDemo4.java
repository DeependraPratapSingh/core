package variableLengthArguement;

public class VrDemo4 {
	public static void main(String ... args) {
		System.out.println("Starting of main");
		System.out.println(args);
		System.out.println("Size :: "+args.length);
		for(String s:args){
			System.out.println("args[] :: "+s);
		}
		System.out.println("Ending of main");
	}
}