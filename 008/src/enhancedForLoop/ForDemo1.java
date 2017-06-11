package enhancedForLoop;

public class ForDemo1 {
	public static void main(String[] args) {
		int x[] = {3,5,7,9};
		for(int i:x){
			System.out.println("x[i] :: "+i);
		}
		
		for(int j=0; j<x.length; j++){
			x[j] = x[j]+1;
		}
		for(int k:x){
			System.out.println(k);
		}
	}
}
