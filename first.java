package practiceTest;


class fruit{
	String name, taste;
	
	public fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		
	}
	public void eat() {
		System.out.println("Name is "+name);
		System.out.println("Taste is "+taste);
	}
	
}
class apple extends fruit{
	@Override
	public void eat() {
		System.out.println("Taste of apple is sweet");
	}
}
class orange extends fruit{
	@Override
	public void eat() {
		System.out.println("Taste of orange is sour");
	}
}
public class first {

	public static void main(String[] args) {

		apple A = new apple() ;
		 A.eat();
		 orange O = new orange() ;
		 O.eat();
	    
	}

}
