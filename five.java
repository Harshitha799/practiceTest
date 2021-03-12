package practiceTest;

public class five {
	
	public String repeatEnd(String str, int n) {

		  if (n == 0)
			  return "";

			  String res = repeat(str, n);
			  String resl ="";

			  for (int i =0 ; i < n ; i ++){
			    resl = resl + res;
			  }
			  return resl;
			}
			public String repeat(String s , int n){
			  String end = "";

			  int len = s.length();

			  end = s.substring(len-n , len);

			  return end;
			
	  }

	public static void main(String[] args) {
		 five f = new five();

		    System.out.println(">" + f.repeatEnd("Hello", 3) + "<");
		    System.out.println(">" + f.repeatEnd("Hello", 2) + "<");
		    System.out.println(">" + f.repeatEnd("Hello", 1) + "<");  
		  }

		  
	

}
