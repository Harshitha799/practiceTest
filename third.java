package practiceTest;

class Name extends Exception{
	public Name() {
		System.out.println("invalid name");
	}
}
class employee{
	private String firstNAme;
	private String lastName;
	public employee(String firstNAme, String lastName) {
		super();
		this.firstNAme = firstNAme;
		this.lastName = lastName;
	}
	
	void validation(String firstName, String lastName) throws Name
	{
		if(firstName== null && lastName== null ) {
			throw new NullPointerException();
		}
		else if(firstName.length()<3 && lastName.length()<3) {
			throw new Name();
		}
		else
			System.out.println("valid name");
	}
}
public class third {

	public static void main(String[] args) throws Name {

		employee e1=new employee("harshitha", "v ");
		e1.validation("harshitha", "v");
	}

}
