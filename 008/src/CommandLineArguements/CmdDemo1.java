package CommandLineArguements;

public class CmdDemo1 {
	public static void main(String[] args) {
		System.out.println("Starting of main");
		System.out.println(args);
		System.out.println("length :: "+args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("End of main");
	}
}
