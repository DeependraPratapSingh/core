package pack5;

public class InvalidAgeException extends Exception {
//	@Override
	public String toString() {
		String msg = "InvalidAgeException : improper age supplied";
		return msg;
		// return super.toString();
	}
}
