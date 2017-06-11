package SinglatonPack1;

/**
 * @author DnzDP
 *
 */
public class SinglatonDemo1 {
	
	//private constructor, so instation is not possible from outside of class.
	private SinglatonDemo1(){}
	
	//Static variable holds only one instance of class.
	private static SinglatonDemo1 s1 = null;
	
	//providing global point to access.
	//lazy-loading is used here, if class needed to instatiated then only objet will create
	public static SinglatonDemo1 CreateInstance(){
		if (s1 == null) {
			synchronized (SinglatonDemo1.class) {
				s1 = new SinglatonDemo1();
				System.out.println("Creating New Instance . . .");
			}
		}
		return s1;
	}
}