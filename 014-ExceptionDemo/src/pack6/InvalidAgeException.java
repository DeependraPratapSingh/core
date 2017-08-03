package pack6;

public class InvalidAgeException extends Exception
{
	public String toString(){
		String msg = "Invalid Age Exception : Not the Valid Age";
		return msg;
	}
}