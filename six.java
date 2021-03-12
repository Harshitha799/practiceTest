package practiceTest;


   
public class six {
	
	

	public static void main(String[] args) {
		
		six s = new six();

	    System.out.println(">" + s.repeatFront("Chocolate", 4) + "<");
	    System.out.println(">" + s.repeatFront("Chocolate", 3) + "<");
	    System.out.println(">" + s.repeatFront("Ice Cream", 2) + "<");  
	  }
	
	
	public String repeatFront(String str, int n) {
	    String result="";
	   if(str.length()==0){
	   return "";
	   }
	   if(str.length()>=1){
	     for(int i=n;i>=1;i--){
	       String sub = str.substring(0,i);
	       result = result + sub;
	     }

	 }
	return result;
		
		
	}

}
