package ImmutablePack1;

/**
 * @author DnzDP
 *
 */
public class TestImmutable {
	public static void main(String[] args) {
		EmituableDemo ed1 = EmituableDemo.CreateInstance("Deependra", 27);
		String s1=ed1.getField1();
		System.out.println("s1 :: "+s1);
		Integer s2 = ed1.getField2();
		System.out.println("s2 :: "+s2);
		System.out.println(ed1);
		
		EmituableDemo ed2 = EmituableDemo.CreateInstance("Stayam", 22);
		String s3 = ed2.getField1();
		System.out.println("s3 :: "+s3);
		Integer s4 = ed2.getField2();
		System.out.println("s4 :: "+s4);
		System.out.println(ed2);
		/*TryModify(ed1.getField1(), ed1.getField2());*/
	}
	
	private static void TryModify(String fd1,Integer fd2){
		
	}
}
