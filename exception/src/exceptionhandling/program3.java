package exceptionhandling;

public class program3 {
	
	public static  void main(String[]args) {
		int a=10;
		for (int i=3;i>=0;i--)
			try {
				
				System.out.println(a/i);
		      }
		finally {

			System.out.println("not");
		}
	  }
  }

