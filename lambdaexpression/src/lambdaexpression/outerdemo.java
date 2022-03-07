package lambdaexpression;
import java.util.Arrays;
import java.util.function.Consumer;
 class outer {
	static String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	
  static class inside implements Consumer<String> {
	 // public static void main(String[] args) 
	  void display()
	  {
		   Consumer<String> c1 =new inside();
	   	
	  }

	@Override
	public void accept(String cars) {
		System.out.println(cars);
		
		
		
	}
  }
 }
public class outerdemo{
	public static void main(String[] args) {
		outer o = new outer();
        lambdaexpression.outer.inside inner = new inside();
        inner.display();
	}
	
}
			  
		
	  
	
