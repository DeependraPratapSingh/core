public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1 hashcode :: ");
		System.out.println(t1.hashCode());
		Test1 t2 = new Test1();
		System.out.println("t12 hashcode ::");
		System.out.println(t2.hashCode());
		
		int i = 0;
		int a[] = new int[500000];
		for ( ; i < a.length; i++) {
			a[i] = i+1;
		}
		System.out.println("Insertation of data done successfully");
		
		/*int j = 0;
		for (;j< a.length;j++) {
			if(a[j] == 499999){
				System.out.println("element found at"+j);
				break;
			}
			System.out.println("Element not found at "+j);
		}*/
	}
}