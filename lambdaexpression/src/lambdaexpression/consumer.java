package lambdaexpression;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.function.Consumer;

public class consumer {
	public static void main(String[] args) {
	ArrayList <String> a= new ArrayList<String>();
	a.add("sona");
	a.add("mona");
	a.add("priya");
	a.forEach(new Consumer<String>() {

		@Override
		public void accept(String a) {
		System.out.println(a);
			
		}
		
	});
}

}


