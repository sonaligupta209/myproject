package exceptionhandling;

public class program11  {
	public static void main (String[] args) {
		try{
		System.out.println(4/0);
		try{
		int[] a={1,2,3};
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Out of bounds");
		}
		}
		catch(ArithmeticException e)
		{
		System.out.println("ArithmeticException : divide by 0");
       }
	}
}