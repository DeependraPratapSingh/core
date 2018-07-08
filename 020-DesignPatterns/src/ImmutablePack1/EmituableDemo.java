package ImmutablePack1;

/**
 * @author DnzDP
 *
 */
//final class, final class can not be overridden
public final class EmituableDemo 
{
	//field declared as private will not be accessible outside the class and makeing them final will ensure 
	//that even accidently you can not change them
	private final String field1;
	private final Integer field2;
	
	//default private constructor will ensure for no unplanned construction of class  
	private EmituableDemo(String fld1,Integer fld2){
		this.field1=fld1;
		this.field2=fld2;
	}
	
	//factory method to store object creation at one place.
	public static EmituableDemo CreateInstance(String fld1,Integer fld2){
		EmituableDemo ed = new EmituableDemo(fld1, fld2);
		return ed;
	}
	
	//No  setter method, Setter methods are meant to change the state of object and this is what we eant to prevet here.
	
	//Getter methods are allowed	
	public String getField1(){
		return field1;
	}
	public Integer getField2(){
		return field2;
	}
	
	@Override
	public String toString() {
			return field1+".."+field2;
	}
}