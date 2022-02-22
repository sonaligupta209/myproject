package exceptionhandling;

public class program4 {
	public static void main (String[] args) {
		int a=10;
		for(int i=3;i>=0;i--);
		 try {
		        System.out.println(a/i);
		 }
		
		catch(ArithmeticException e)
		   {
		   System.out.println(e);
		   }
		 finally {
				System.out.println("between try and catch");
				}
	}
  }


