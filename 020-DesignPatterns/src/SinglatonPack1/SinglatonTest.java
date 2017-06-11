package SinglatonPack1;

/**
 * @author DnzDP
 *
 */
public class SinglatonTest {
	public static void main(String[] args) {
		SinglatonDemo1 s1 = SinglatonDemo1.CreateInstance();
		System.out.println("Hashcode of s1 object :: "+s1.hashCode());
		System.out.println();
		
		SinglatonDemo1 s2 = SinglatonDemo1.CreateInstance();
		System.out.println("HashCode of s2 object :: "+s2.hashCode());
	}
}