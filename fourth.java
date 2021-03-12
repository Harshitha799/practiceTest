package practiceTest;

public class fourth {

	public static void main(String[] args) {
		fourth f = new fourth();

	    System.out.println(">" + f.mixString("abc", "xyz") + "<");
	    System.out.println(">" + f.mixString("Hi", "There") + "<");
	    System.out.println(">" + f.mixString("xxxx", "There") + "<");
	  }

	  public String mixString(String a, String b) {
	    String result = "";
	    int index = 0;
	    
	    for(int i=0; i<a.length() && i<b.length(); i++){
	      result += a.substring(i, i+1) + b.substring(i, i+1);
	    }
	    
//	   
	    return result;
	  }
	

}
