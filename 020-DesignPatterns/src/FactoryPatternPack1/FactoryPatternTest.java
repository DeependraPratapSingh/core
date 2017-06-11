package FactoryPatternPack1;

/**
 * @author DnzDP
 *
 */
public class FactoryPatternTest {
	public static void main(String[] args) {
		FactoryPatternTest f1 = new FactoryPatternTest();
		System.out.println();
		AbsFact f2 = f1.getInstance(args[0]);
		System.out.println();
		System.out.println("object is created for :"+f2.getClass());
	}
	
	public AbsFact getInstance(String Abc){
		if (Abc.equals("F1")) {
			return new FactoryPatternDemo1();
		}
		else if (Abc.equals("F2")) {
			return new FactoryPattentDemo2();
		}
		else {
			return null;
		}
	}
}
