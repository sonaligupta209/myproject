package exceptionhandling;

public class program15 {
	
		static void func(int a) throws Exception{
		System.out.println(10/a);
		}
		public static void main (String[] args) {
		try{
		func(10);
		func(0);
		}catch(Exception e){
		System.out.println("can't divide by zero");
		}
		}
		}
