// WAP to check, if Strings are rotations of each other or not.
package Pack1;

public class Prog07AreRotations {
	public static boolean areRotations(String str1, String str2){
		return (str1.length() == str2.length()) && ( (str1+str1).indexOf(str2) != -1 );
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		if(areRotations(str1, str2))
			System.out.println("Are Rotations");
		else 
			System.out.println("Not Rotations");
	}

}
