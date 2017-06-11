public class ArrayDemo2 {
	public static void main(String[] args) {
		int i[] = {4,3,6,8,1};
		for (int j = 0; j < i.length; j++) {
			System.out.println("i["+j+"] :: "+i[j]);
		}
		long j[] = {4,3,6,8,1};
		for (int j2 = 0; j2 < j.length; j2++) {
			System.out.println("j["+j2+"] :: "+j[j2]);
		}
		int k[] = {'4','3','6','8','1'};
		for (int k2 = 0; k2 < k.length; k2++) {
			System.out.println("k["+k2+"] :: "+k[k2]);
		}
		
//		float l[] = {3.4,6.8,1.2};
		float l[] = {3.4f,6.8f,1.2f};
		System.out.println(l);
		for (int l2 = 0; l2 < l.length; l2++) {
			System.out.println("l["+l2+"] :: "+l[l2]);
		}
		
		char ch[] = {'j','a','v','a'};
		System.out.println(ch);
		System.out.println("ch :: "+ch);
		
		long ar[] = null;
		ar = new long[3];
		ar[0] = 45;
		ar[1] = 13;
		ar[2] = 23;
		System.out.println("ar :: "+ar);
		System.out.println("ar[ar.length-1] :: "+ar[ar.length-1]);
		
		/*int z[] = null;
		z = {1,2,3,4};*/
	}
}
